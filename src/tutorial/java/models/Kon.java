package tutorial.java.models;

public class Kon implements Ziemne {

    private String nazwa;

    public Kon(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String dajGlos() {
        return "Kuń";
    }

    @Override
    public String getNazwa() {
        return this.nazwa;
    }

    @Override
    public String oddychaj() {
        return "Oddycha";
    }
}
