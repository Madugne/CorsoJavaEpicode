package entities;
public class DipendenteFullTime extends Dipendenti{
    public DipendenteFullTime(long matricola, double stipendio, Settore settore) {
        super(matricola, stipendio, settore);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Ho uno stipendio" + stipendio + "euro al mese e sono FullTime");
    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", settore=" + settore +
                '}';
    }

    @Override
    public void checkIn() {

    }
}
