package EsercizioSettimanale1;

import EsercizioSettimanale1.interfaces.InterfacciaImmagineShow;
import EsercizioSettimanale1.interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements InterfacciaImmagineShow, Luminosita {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void show() {
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi += "*";
        }
        System.out.println(titolo + " " + asterischi);
    }

    @Override
    public void esegui() {
        show();
        System.out.println();
    }

    @Override
    public void alzaLuminosita() {
        luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        } else {
            System.out.println("Luminosita' al minimo");
        }
    }
}
