import java.util.Arrays;

public class Esercizio1 {
    public static void multiplica (int numero1, int numero2) {
        int risultato;
        risultato = numero1*numero2;
        System.out.println("il risultato e': " + risultato);
    }
    public static void concatena (String stringa, int numero) {
        String catena;
        catena = stringa + numero;
        System.out.println(catena);
    }
    public static void inserisciInArray (String[] array, String stringa) {
        if (array.length!= 5) {
            System.out.println("lunghezza array errata");
        } else {
            String[] stringaArrayNuova = {array[0], array[1], stringa, array[2], array[3], array[4]};
            System.out.println("array nuovo " + Arrays.toString(stringaArrayNuova));
        }
    }

}
