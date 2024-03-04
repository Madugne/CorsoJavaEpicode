import java.util.Scanner;

public class Esercizio2 {
    public static void inserisciStringhe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci parola 1");
        String parola1 = scanner.nextLine();
        System.out.println("inserisci parola 2");
        String parola2 = scanner.nextLine();
        System.out.println("inserisci parola 3");
        String parola3 = scanner.nextLine();
        scanner.close();
        System.out.println(parola1+" "+parola2+" "+parola3);
        System.out.println(parola3+" "+parola2+" "+parola1);
    }
}
