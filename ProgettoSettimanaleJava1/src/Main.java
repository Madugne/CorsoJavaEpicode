import EsercizioSettimanale1.Audio;
import EsercizioSettimanale1.ElementoMultimediale;
import EsercizioSettimanale1.Immagine;
import EsercizioSettimanale1.Video;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[0];
        String titolo;
        int durata;
        int volume;
        int luminosita;
        while(elementi.length < 5) {
            System.out.println("LETTORE MULTIMEDIALE \n SELEZIONA ELEMENTO DA CREARE:" );
            System.out.println("1 - Video");
            System.out.println("2 - Immagine");
            System.out.println("3 - Audio \n");
            int selezionato = scanner.nextInt();

            switch (selezionato) {
                case 1:
                    System.out.println("Inserisci il titolo:");
                    titolo = scanner.next();
                    System.out.println("Inserisci la durata:");
                    durata = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    volume = scanner.nextInt();
                    System.out.println("Inserisci la luminosita':");
                    luminosita = scanner.nextInt();
                    ElementoMultimediale videoCreato = new Video(titolo, volume, luminosita, durata);
                    elementi = copiaArray(elementi, videoCreato);
                    break;
                case 2:
                    System.out.println("Inserisci il titolo:");
                    titolo = scanner.next();
                    System.out.println("Inserisci la luminosita':");
                    luminosita = scanner.nextInt();
                    ElementoMultimediale immagineCreata = new Immagine(titolo, luminosita);
                    elementi = copiaArray(elementi, immagineCreata);
                    break;
                case 3:
                    System.out.println("Inserisci il titolo:");
                    titolo = scanner.next();
                    System.out.println("Inserisci la durata:");
                    durata = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    volume = scanner.nextInt();
                    ElementoMultimediale audioCreato = new Audio(titolo, volume, durata);
                    elementi = copiaArray(elementi, audioCreato);
                    break;
                default:
                    System.out.println("Numero non valido");
                    break;
            }
        }

        while 
    }
    public static ElementoMultimediale[] copiaArray(ElementoMultimediale[] elementiCreati, ElementoMultimediale elemento) {
        ElementoMultimediale[] nuovoArray = new ElementoMultimediale[elementiCreati.length + 1];
        for (int i = 0; i < elementiCreati.length; i++) {
            nuovoArray[i] = elementiCreati[1];
        }
        nuovoArray[elementiCreati.length] = elemento;
        return nuovoArray;
    }
}