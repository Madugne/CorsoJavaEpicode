package EsercizioSettimanale1;

public abstract class ElementoMultimediale {
    protected String titolo;
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public abstract void esegui();

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
