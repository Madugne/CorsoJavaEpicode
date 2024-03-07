package entities;

public class DipendentePartTime extends Dipendenti {
    private int oreLavorate;
    public DipendentePartTime(long matricola, double stipendio, Settore settore, int oreLavorate) {
        super(matricola, stipendio, settore);
        this.oreLavorate = oreLavorate;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }
    @Override
    public void calculateSalary() {
        if (oreLavorate > 36) {System.out.println( "Ho uno stipendio di " +stipendio*1.2 + "euro al mese e sono PartTime");} else {
            System.out.println(stipendio);
            System.out.println("Ho uno stipendio di " + stipendio + " euro al mese e sono PartTime");
        }}

    @Override
    public String toString() {
        return "DipendentePartTime{" +
                "oreLavorate=" + oreLavorate +
                ", matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", settore=" + settore +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println("Ho iniziato a lavorare");
    }
}
