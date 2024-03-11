package Esercizio3;

import Esercizio3.exceptions.exceptionsBanca;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws exceptionsBanca {
        if (nMovimenti < maxMovimenti) {
            saldo -= x;
            if (saldo < 0) {
                throw new exceptionsBanca("Il conto e' in rosso");
            }
        } else {
            saldo = saldo - x - 0.50;
        }
        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }
}
