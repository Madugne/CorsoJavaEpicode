package Esercizio2;

import java.util.*;
import java.lang.Math;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<Integer> listaCasuale = listaCasualeOrdinata(5);
        listaCasualeOrdinataInversa(listaCasuale);
        pariDispari(listaCasuale, false); //FALSE = NUMERI DISPARI, TRUE = NUMERI PARI
    }
    public static List<Integer> listaCasualeOrdinata(int n) {
        List<Integer> listaCasuale = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numeroCasuale = (int) (Math.random() * 101);
            listaCasuale.add(numeroCasuale);
        }
        Collections.sort(listaCasuale);
        System.out.println(listaCasuale);
        return listaCasuale;
    }
    public static List<Integer> listaCasualeOrdinataInversa(List<Integer> lista) {
        List<Integer> listaSommata = new ArrayList<>();
        listaSommata.addAll(lista);
        Collections.reverse(lista);
        listaSommata.addAll(lista);
        System.out.println(listaSommata);
        return listaSommata;
    }

    public static void pariDispari(List<Integer> lista, boolean booleano) {

        List<Integer> listaArray = new ArrayList<>();
        if (booleano) {
            for (int i = 0; i < lista.size(); i++) {
                if (i % 2 == 0) {
                    listaArray.add(lista.get(i));
                }
            }
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if (!(i % 2 == 0)) {
                    listaArray.add(lista.get(i));
                }
            }
        }
        Collections.sort(listaArray);
        System.out.println(listaArray);
    }
}
