package CetvrtaNedelja.DomaciNedelja.Zadatak2;


public class Boca {
    double zapremina;

    Boca() {

    }

    Boca(double zapremina) {
        this.zapremina = zapremina;
    }

    public String toString() {
        return "Boca: " + "zapremina = " + zapremina;
    }

    public double getZapremina() {
        return zapremina;
    }

}
