package CetvrtaNedelja.DomaciNedelja.Zadatak1;

public class Televizor {
    int jacinaTona = 0;
    int trenutniProgram = 1;
    boolean ukljucen = false;

    void ukljuci() {
        ukljucen = true;
    }

    void iskljuci() {
        ukljucen = false;
    }

    void pojacajTon() {
        jacinaTona = jacinaTona + 1;
    }

    void smanjiTon() {
        jacinaTona = jacinaTona - 1;
    }

    void iskljuciTon() {
        jacinaTona = 0;
    }

    void promeniProgramNavise() {
        trenutniProgram = trenutniProgram + 1;
    }

    void promeniProgramNanize() {
        if (trenutniProgram > 0) {
            trenutniProgram = trenutniProgram - 1;
        } else trenutniProgram = 0;
    }

    void vratiTrenutniProgram() {
        trenutniProgram = trenutniProgram;
    }

    void vratiJacinutona() {
        jacinaTona = jacinaTona;
    }

    void daLiJeUkljucen() {
        ukljucen = ukljucen;
    }

    public String ispisiParametre() {
        return "Jacina tona: " + jacinaTona + "\n" + "Trenutni program: " + trenutniProgram + "\n" + "Ukljucen: " + ukljucen;
    }


}
