package EsercizioSettimanale1;

import EsercizioSettimanale1.interfaces.Riproducibile;
import EsercizioSettimanale1.interfaces.Volume;

public class Audio extends ElementoMultimediale implements Riproducibile, Volume {
    protected double durata;
    protected int volume;
    public Audio(String titolo, double durata, int volume) {
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
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo);
            for (int j = 0; j < volume; j++) {
                System.out.println("!");
            }
        }
    }
}
