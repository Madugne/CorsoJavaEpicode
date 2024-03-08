package EsercizioSettimanale1;

import EsercizioSettimanale1.interfaces.RiproducibileVolume;

public class Audio extends ElementoMultimediale implements RiproducibileVolume {
    private int durata;
    private int volume;
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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
            System.out.println("Audio in muto");
        }
    }
    @Override
    public void play() {
        String esclamativi = "";
        for (int i = 0; i < volume; i++) {
            esclamativi += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + esclamativi);
        }
    }

    @Override
    public void esegui() {
        play();
    }
}
