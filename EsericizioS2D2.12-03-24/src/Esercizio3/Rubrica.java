package Esercizio3;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private HashMap<String, Long> contatti;
    public Rubrica(HashMap<String, Long> contatti) {
        this.contatti = contatti;
    }

    public HashMap<String, Long> getContatti() {
        return contatti;
    }

    public void setContatti(HashMap<String, Long> contatti) {
        this.contatti = contatti;
    }

    public void inserisci(String nome, Long numero) {
        getContatti().put(nome, numero);
    }
    public void rimuovi(String nome) {
        getContatti().remove(nome);
    }
    public String cercaPersona(Long numero){
        for (Map.Entry<String, Long> entry : getContatti().entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
    }
        return "Contatto non trovato";
    }
    public Long cercaNumero(String nome) {
        return getContatti().get(nome);
    }

    public void stampaContatti() {
        System.out.println(getContatti().toString());
    }
}
