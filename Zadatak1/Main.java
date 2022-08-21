package CetvrtaNedelja.DomaciNedelja.Zadatak1;

public class Main {
    public static void main(String[] args) {

        Televizor tv1 = new Televizor();

        System.out.println(tv1.ispisiParametre());
        System.out.println("--------------------------------------------------------");
        tv1.ukljuci();
        tv1.pojacajTon();
        tv1.pojacajTon();
        tv1.promeniProgramNanize();
        tv1.promeniProgramNanize();
        tv1.promeniProgramNanize();


        System.out.println(tv1.ispisiParametre());



    }


}
