package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(1, 10) + 1;
        }

        System.out.println("Array iniziale: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Inserisci un numero: ");
                int numeroInserito = scanner.nextInt();

                if (numeroInserito == 0) {
                    break;
                }

                System.out.print("Inserisci una posizione (0-4): ");
                int position = scanner.nextInt();

                if (position < 0 || position > 4) {
                    throw new IllegalArgumentException("Posizione non valida");
                }

                array[position] = numeroInserito;
                System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));
            } catch (IllegalArgumentException errore) {
                System.out.println("Errore: " + errore.getMessage());
            } catch (Exception errore) {
                System.out.println("Errore: input non valido");
                scanner.nextLine();
            }
        }
        System.out.println("fine");
        scanner.close();
    }
}