package EsercizioSettimanale1;

import EsercizioSettimanale1.interfaces.Luminosita;
import EsercizioSettimanale1.interfaces.RiproducibileVolume;

public class Video extends ElementoMultimediale implements RiproducibileVolume, Luminosita {
    private int durata;
    private int volume;
    private int luminosita;


    public Video(String titolo, int volume, int luminosita, int durata) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        String esclamativi = "";
        for (int i = 0; i < volume; i++) {
            esclamativi += "!";
        }
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi += "*";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + esclamativi + " " + asterischi);
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Video in muto");
        }
    }

    @Override
    public void esegui() {
        play();
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
