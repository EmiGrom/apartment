public class Apartament {
    String miasto;
    int powierzchnia;
    double cena;

    public Apartament(String miasto, int powierzchnia, double cena) {
        this.miasto = miasto;
        this.powierzchnia = powierzchnia;
        this.cena = cena;
    }

    public Apartament(double a) {
        this.cena = a * 0.95;
    }

    public Apartament(int a) {
        this.powierzchnia = a * a;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void getFullPrice ( int n ) {
        cena = cena * 0.95;
    }

    public double cena() {
        return this.cena;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "miasto='" + miasto + '\'' +
                ", powierzchnia=" + powierzchnia +
                ", cena=" + cena +
                '}';
    }
}


