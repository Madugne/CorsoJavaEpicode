package EsercizioSettimanale1;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private double durata;
    private int volume;
    public Audio(String titolo, double durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void alzaVolume() {
        volume++;
    }
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Audio in muto");
        }
    }
    @Override
    public void play() {
        for (int i =0; i < durata; i++) {
            System.out.println(titolo);
        }
    }
}
