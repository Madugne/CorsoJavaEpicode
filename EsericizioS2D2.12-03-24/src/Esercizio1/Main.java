package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le parole:");
        Set<String> setParole = new HashSet<>();
        Set<String> setParoleDuplicate = new HashSet<>();
        Set<String> setParoleDiverse = new HashSet<>();
        System.out.println("Quante stringhe vuoi stampare?");
        int numeroStringhe = scanner.nextInt();
        for (int i = 0; i < numeroStringhe; i++) {
            System.out.print("Inserisci una stringa");
            String parola = scanner.next();
            if (!setParole.add(parola)) {
                setParoleDuplicate.add(parola);
            }
            setParoleDiverse.add(parola);
        }
        System.out.println("parole duplicate: ");
        for (String parola : setParoleDuplicate) {
            System.out.println(parola);
        }
        int nParoleDiverse = setParoleDiverse.size();
        System.out.println("numero di parole diverse: " + nParoleDiverse);
        System.out.println("parole diverse: ");
        for (String parola: setParoleDiverse) {
            System.out.println(parola);
        }
        scanner.close();
    }
}
