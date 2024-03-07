package entities;
import interfaces.CheckIn;
public class Volontario implements CheckIn {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", cv='" + cv + '\'' +
                '}';
    }

    public void info() {
        System.out.println("Sono "+ nome + "ho " + eta + " anni " + "il mio mestiere era" + cv);
    }
    @Override
    public void checkIn() {
        System.out.println("Ho iniziato a lavorare");
    }
}
