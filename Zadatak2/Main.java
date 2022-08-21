package CetvrtaNedelja.DomaciNedelja.Zadatak2;

public class Main {


    public static void main(String[] args) {
        Boca b1 = new Boca(0.45);

        System.out.println(b1);

        VinskaBoca b2 = new VinskaBoca(b1.getZapremina(), "Kovacevic");
        System.out.println(b2);

        RonilackaBoca b3 = new RonilackaBoca(b1.getZapremina(), 12.5);
        System.out.println(b3);

        System.out.println(b1.getZapremina() == b2.getZapremina());

    }

}



