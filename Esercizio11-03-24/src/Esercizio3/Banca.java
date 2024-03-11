package Esercizio3;
import Esercizio3.exceptions.exceptionsBanca;

public class Banca {
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Mario Rossi", 50000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(10000);

            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (exceptionsBanca e) {
            System.out.println("Errore nel prelievo: " + e);
            e.printStackTrace();
        }

        ContoOnline conto2 = new ContoOnline("Chris Keya", 10.50, 1);

        conto2.stampaSaldo();

        try {
            conto2.preleva(1);

            conto2.stampaSaldo();
        } catch (exceptionsBanca e) {
            System.out.println("Errore nel prelievo: " + e);
            e.printStackTrace();
        }
    }
}
