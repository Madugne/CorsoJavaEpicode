import esercizio1.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(10, 5);
        Rettangolo rettangolo2 = new Rettangolo(15, 10);
        rettangolo1.stampaRettangolo();
        rettangolo1.stampaDueRettangolo(rettangolo2);
    }
}