package CetvrtaNedelja.DomaciNedelja.Zadatak2;


public class RonilackaBoca extends Boca {
    static {
        System.out.println("--- RONILACKA BOCA ---");
    }

    double masa;

    RonilackaBoca() {
    }

    RonilackaBoca(double zapremina, double masa) {
        super(zapremina);
        this.masa = masa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Masa = " + masa;
    }

}
