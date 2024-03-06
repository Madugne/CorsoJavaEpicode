package esercizio3;

import java.util.Arrays;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli = new Articolo[0];
    private double totaleCostoArticoli;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public void setElencoArticoli(Articolo[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }

    public double getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public void setTotaleCostoArticoli(double totaleCostoArticoli) {
        this.totaleCostoArticoli = totaleCostoArticoli;
    }

    public void stampaCarrello() {
        System.out.println(getClienteAssociato());
        System.out.println(Arrays.toString(getElencoArticoli()));
        System.out.println("il totale e' "+getTotaleCostoArticoli());
    }

    public void aggiungiArticolo(Articolo articolo) {
        Articolo[] articoli = new Articolo[getElencoArticoli().length+1];
        for (int i = 0; i < articoli.length-1; i++) {
            articoli[i] = getElencoArticoli()[i];
        }
        articoli[articoli.length-1] = articolo;
        setElencoArticoli(articoli);
        setTotaleCostoArticoli(calcoloCostoArticoli());
    }

    public double calcoloCostoArticoli() {
        double risultato = 0;
        for (int i = 0; i < getElencoArticoli().length; i++) {
            risultato+=getElencoArticoli()[i].getPrezzo();
        }
        return risultato;
    }
}
