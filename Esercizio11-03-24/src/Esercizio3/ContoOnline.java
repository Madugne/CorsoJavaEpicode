package Esercizio3;
import Esercizio3.exceptions.exceptionsBanca;

public class ContoOnline extends ContoCorrente {
    double maxPrelievo;

    ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    ContoOnline(String titolare, double saldo) {
        super(titolare, saldo);
    }

    void stampaSaldo() {

        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws exceptionsBanca {
        if (x > maxPrelievo) {
            throw new exceptionsBanca("Il prelievo non e' disponibile");
        } else {
            super.preleva(x);
        }
    }
}
