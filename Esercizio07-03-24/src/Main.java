import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dipendenti[] dipendenti = {new DipendenteFullTime (123456, 2000.00, Settore.AMMINISTRAZIONE),
                new Dirigente(654321, 2300.00, Settore.PRODUZIONE),
                new DipendentePartTime(987456, 1600.00, Settore.VENDITE, 24)
        };
        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].infoDipendente();
            dipendenti[i].checkIn();
            dipendenti[i].calculateSalary();
        }
        Volontario volontario = new Volontario("Chris", 30, "Cameriere");
        volontario.info();
        volontario.checkIn();
    }
}