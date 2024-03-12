package Esercizio3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica(new HashMap<>());
        rubrica.inserisci("Marco", 111222333L);
        rubrica.inserisci("Luca", 444555666L);
        rubrica.inserisci("Luigi", 777888999L);
        rubrica.inserisci("Chris", 100000000L);
        rubrica.stampaContatti();
        rubrica.rimuovi("Marco");
        System.out.println(rubrica.cercaNumero("Chris"));
        System.out.println(rubrica.cercaPersona(100000000L));
        rubrica.stampaContatti();
    }
}