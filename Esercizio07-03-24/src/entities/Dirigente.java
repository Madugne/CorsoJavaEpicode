package entities;

public class Dirigente extends Dipendenti {
    public Dirigente(long matricola, double stipendio, Settore settore) {
        super(matricola, stipendio, settore);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Ho uno stipendio" + stipendio + "euro al mese");
    }
}
