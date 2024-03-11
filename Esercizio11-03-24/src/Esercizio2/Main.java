package Esercizio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.println("Inserisci km percorsi");
        int km = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci litri di carburante usati");
        int litri = Integer.parseInt(scanner.nextLine());

        if (km < 0) {
            throw new IllegalArgumentException("Errore: non puoi aver percorso km negativi");
        }

        if (litri == 0 || litri < 0) {
            throw new ArithmeticException("Errore: non si puo' dividere per zero o meno");
        }
        double kmL = (double) km / litri;
        System.out.println("Il consumo e': " + kmL + "km/l");
    } catch (NumberFormatException errore) {
        System.out.println("Input non valido. Inserire un numero.");
    } catch (ArithmeticException | IllegalArgumentException errore) {
        System.out.println("Errore: " + errore.getMessage());
    } finally {
        scanner.close();
    }
    }
}
