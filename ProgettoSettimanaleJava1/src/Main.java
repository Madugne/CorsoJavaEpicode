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
        Video video = new Video("VideoTest", 10, 20, 30);
        System.out.println(video.getVolume());
        video.alzaVolume();
        System.out.println(video.getVolume());
        video.abbassaVolume();video.abbassaVolume();video.abbassaVolume();
        System.out.println(video.getVolume());
        System.out.println(video.getLuminosita());
        video.alzaLuminosita();
        System.out.println(video.getLuminosita());
        video.abbassaLuminosita();video.abbassaLuminosita();video.abbassaLuminosita();
        System.out.println(video.getLuminosita());
        ElementoMultimediale[] elementi = new ElementoMultimediale[0];
        String titolo;
        int durata;
        int volume;
        int luminosita;
        int selezionato;
        boolean esci = false;
        while(elementi.length < 5) {
            System.out.println("LETTORE MULTIMEDIALE \n SELEZIONA ELEMENTO DA CREARE:" );
            System.out.println("1 - Video");
            System.out.println("2 - Immagine");
            System.out.println("3 - Audio \n");
            selezionato = scanner.nextInt();
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
                    System.out.println("NUMERO NON VALIDO");
                    break;
            }
        }
        while (!esci) {
            System.out.println("SELEZIONA ELEMENTO DA ESEGUIRE:");
            System.out.println("1" + " - " + elementi[0].getTitolo());
            System.out.println("2" + " - " + elementi[1].getTitolo());
            System.out.println("3" + " - " + elementi[2].getTitolo());
            System.out.println("4" + " - " + elementi[3].getTitolo());
            System.out.println("5" + " - " + elementi[4].getTitolo());
            System.out.println("0 - PER USCIRE \n");
            selezionato = scanner.nextInt();
            switch (selezionato) {
                case 1:
                    elementi[0].esegui();
                    break;
                case 2:
                    elementi[1].esegui();
                    break;
                case 3:
                    elementi[2].esegui();
                    break;
                case 4:
                    elementi[3].esegui();
                    break;
                case 5:
                    elementi[4].esegui();
                    break;
                case 0:
                    esci = true;
                    break;
                default:
                    System.out.println("NUMERO NON VALIDO");
                    break;
            }
        }
    }
    public static ElementoMultimediale[] copiaArray(ElementoMultimediale[] elementiCreati, ElementoMultimediale elemento) {
        ElementoMultimediale[] nuovoArray = new ElementoMultimediale[elementiCreati.length + 1];
        for (int i = 0; i < elementiCreati.length; i++) {
            nuovoArray[i] = elementiCreati[i];
        }
        nuovoArray[elementiCreati.length] = elemento;
        return nuovoArray;
    }
}