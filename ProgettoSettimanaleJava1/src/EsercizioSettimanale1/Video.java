package EsercizioSettimanale1;

import EsercizioSettimanale1.interfaces.Riproducibile;
import EsercizioSettimanale1.interfaces.Volume;

public class Video extends ElementoMultimediale implements Riproducibile, Volume {
    protected double durata;
    protected int volume;
    protected int luminosita;


    public Video(String titolo, int volume, int luminosita, double durata) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {

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
}
