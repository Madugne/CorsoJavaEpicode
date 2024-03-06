package esercizio2;

import java.util.Arrays;

public class Sim {
    private long numeroDiTelefono;
    private int creditoDisponibile;
    private Chiamata[] chiamate;

    public Sim(long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public long getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public int getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setNumeroDiTelefono(long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public void setCreditoDisponibile(int creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void infoSim() {
        System.out.println(getNumeroDiTelefono());
        System.out.println(getCreditoDisponibile());
        if (getChiamate()== null) {
            System.out.println("nessuna chiamata");
        } else {System.out.println(Arrays.toString(getChiamate()));}
    }
}
