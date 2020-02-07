package tutorial.java.models;

public class Pies implements Ziemne {

    private String nazwa;

    public Pies(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String dajGlos() {
        return "Szczeka";
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String oddychaj() {
        return "Oddycha powietrzem";
    }
}
