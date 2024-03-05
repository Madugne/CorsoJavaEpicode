package esercizio1;

import java.util.Scanner;

public class esercizio1 {
    public static void stringaPariDispari() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String stringa = scanner.nextLine();

        int lunghezza = stringa.length();
        System.out.println(lunghezza);
        if (lunghezza%2 == 0) {
            System.out.println("pari");
        } else {
            System.out.println("dispari");
        };
    }

    public static void annoBisestile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un anno");
        int anno = scanner.nextInt();
        if (anno%4 == 0 && (anno % 100 == 0 && anno % 400 == 0)) {
            System.out.println("anno bisestile");
        } else {
            System.out.println("anno non bisestile");
        }
    }
}
