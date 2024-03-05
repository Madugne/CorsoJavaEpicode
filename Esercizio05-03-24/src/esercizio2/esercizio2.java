package esercizio2;

import java.util.Scanner;

public class esercizio2 {
    public static void stampaSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3");
        int numero = scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("errore: numero non compreso tra 0 e 3");
        }
    }
}
