import esercizio1.Rettangolo;
import esercizio2.Chiamata;
import esercizio2.Sim;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ESERCIZIO1
        Rettangolo rettangolo1 = new Rettangolo(10, 5);
        Rettangolo rettangolo2 = new Rettangolo(15, 10);
        rettangolo1.stampaRettangolo();
        rettangolo1.stampaDueRettangolo(rettangolo2);
        //ESERCIZIO2
        Sim sim1 = new Sim(389389389);
        Chiamata[] chiamate = {new Chiamata(), new Chiamata(), new Chiamata(), new Chiamata(), new Chiamata()};
        sim1.setChiamate(chiamate);
        sim1.infoSim();

    }
}