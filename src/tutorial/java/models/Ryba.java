package tutorial.java.models;

public class Ryba implements Wodne {

    private String nazwa;

    public Ryba(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String plyn() {
        return "Płynie";
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String oddychaj() {
        return "Oddycha wodą";
    }
}
