package CetvrtaNedelja.DomaciNedelja.Zadatak2;

public class VinskaBoca extends Boca{
    static{
        System.out.println("--- VINSKA BOCA ---");
    }
    String nazivVina;


    VinskaBoca(){

    }
    VinskaBoca(double zapremina, String nazivVina){
        super(zapremina);
        this.nazivVina = nazivVina;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Naziv vina: " + nazivVina;
    }
}
