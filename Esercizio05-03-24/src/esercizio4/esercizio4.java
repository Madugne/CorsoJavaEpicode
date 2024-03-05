package esercizio4;

import java.util.Scanner;

public class esercizio4 {
    public static void contoAllaRovescia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();
        for (int i = numero; i>-1; i--) {
        System.out.println(i);
        scanner.close();
    }}
}
