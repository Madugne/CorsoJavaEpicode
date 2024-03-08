package EsercizioSettimanale1;

import EsercizioSettimanale1.interfaces.InterfacciaImmagineShow;

public class Immagine extends ElementoMultimediale implements InterfacciaImmagineShow {
    protected int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }
    public void aumentaLuminosita() {
        luminosita++;
    }
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        } else {
            System.out.println("Luminosita' al minimo");
        }
    }
    @Override
    public void show() {
        System.out.println(titolo);
        for (int i = 0; i < luminosita; i++) {
            System.out.println("*");
        }
    }
}
