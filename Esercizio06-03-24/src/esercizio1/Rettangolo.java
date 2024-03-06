package esercizio1;

public class Rettangolo {
    private int base;
    private int altezza;
    private int perimetro;
    private int area;

    public Rettangolo() {
    }

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getPerimetro() {
        return ((getBase()+getAltezza())*2);
    }

    public int getArea() {
        return (getBase()*getAltezza());
    }

    public void stampaRettangolo() {
        System.out.println("il perimetro e' "+getPerimetro());
        System.out.println("l'area e' "+getArea()+"\n");
    }
    public void stampaDueRettangolo(Rettangolo rettangolo) {
        System.out.println("primo rettangolo:");
        stampaRettangolo();
        System.out.println("secondo rettangolo:");
        rettangolo.stampaRettangolo();
        System.out.println("la somma del perimetro e' "+(getPerimetro()+rettangolo.getPerimetro()));
        System.out.println("la somma delle aree e' "+(getArea()+rettangolo.getArea()));
    }
}
