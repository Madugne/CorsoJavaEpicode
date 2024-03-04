public class Esercizio3 {
    public static void calcolaPerimetroRettangolo(double lato1, double lato2) {
        double perimetro = (lato1*2)+(lato2*2);
        System.out.println("il perimetro e' "+perimetro);
    }
    public static void pariDispari(int numero) {
        if (numero % 2 == 0 ) {
            System.out.println("numero pari");
        } else {
            System.out.println("numero dispari");
    }
    }
    public static void calcolaAreaTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1+lato2+lato3)/2;
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-lato1)*(semiPerimetro-lato2)*(semiPerimetro-lato3));
        System.out.println("il perimetro e' "+semiPerimetro*2);
        System.out.println("l'area e' "+area);
    }
}
