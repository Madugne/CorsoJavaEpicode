package esercizio3;

import java.util.Arrays;
import java.util.Scanner;

public class esercizio3 {
    public static void dividiStringa() {
        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String stringa = scanner.nextLine();
        System.out.println(Arrays.toString(stringa.toCharArray()));
        if (":q".equals(stringa)) {
            break;
        }
        }
    }
}
