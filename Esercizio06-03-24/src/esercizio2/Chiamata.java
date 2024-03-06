package esercizio2;

import java.util.Random;

public class Chiamata {
    private final int durata;
    private final long numeroChiamato;

    public Chiamata() {
        Random rndm = new Random();
        this.durata = rndm.nextInt(1, 120);
        this.numeroChiamato = rndm.nextLong(1, 9999999999L);
    }

    public int getDurata() {
        return durata;
    }

    public long getNumeroChiamato() {
        return numeroChiamato;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "durata=" + durata +
                ", numeroChiamato=" + numeroChiamato +
                '}';
    }
}
