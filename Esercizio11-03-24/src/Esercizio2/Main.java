package Esercizio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.println("Inserisci km percorsi");
        int km = scanner.nextInt();

        System.out.println("Inserisci litri di carburante usati");
        int litri = scanner.nextInt();

        if (km < 0) 

        if (litri == 0 || litri < 0) {
            throw new ArithmeticException("Errore: non si puo' dividere per zero o meno");
        }
    }
    }
}
