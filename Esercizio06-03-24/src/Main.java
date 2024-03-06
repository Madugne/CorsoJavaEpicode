import esercizio1.Rettangolo;
import esercizio2.Chiamata;
import esercizio2.Sim;
import esercizio3.Articolo;
import esercizio3.Carrello;
import esercizio3.Cliente;

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
        //ESERCIZIO3
        Articolo articolo = new Articolo("A1111", "cellulare", 499.90,10);
        Articolo articolo2 = new Articolo("B1111", "TV", 400,5);
        Cliente cliente = new Cliente("Mariooo","Mario", "Rossi", "mario.rossi@gmail.com", "02-02-00");
        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(articolo);
        carrello.aggiungiArticolo(articolo2);
        carrello.stampaCarrello();
    }
}