package entities;

import java.util.Random;

public abstract class Dipendenti {
    protected long matricola;
    protected double stipendio;
    protected Settore settore;

    public Dipendenti(long matricola, double stipendio, Settore settore) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.settore = settore;
    }

    public long getMatricola() {
        return matricola;
    }

    public void setMatricola(long matricola) {
        this.matricola = matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public Settore getSettore() {
        return settore;
    }

    public void setSettore(Settore settore) {
        this.settore = settore;
    }

    public void infoDipendente() {
        System.out.println("Sono la matricola n." + this.matricola + " , ho uno stipendio di "
        + this.stipendio + ", appartengo al settore " + this.settore);
    }

    @Override
    public String toString() {
        return "Dipendenti{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", settore=" + settore +
                '}';
    }
}
