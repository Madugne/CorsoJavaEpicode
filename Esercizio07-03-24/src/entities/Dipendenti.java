package entities;
import interfaces.CheckIn;

public abstract class Dipendenti implements CheckIn {
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
        System.out.println("Sono la matricola n." + this.matricola + ", appartengo al settore " + this.settore);
    }

    public abstract void calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Ho iniziato a lavorare");
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
