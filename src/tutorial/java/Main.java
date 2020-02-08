package tutorial.java;

import tutorial.java.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int ileZwierzat = 3;
        List<Pies> hodowlaPsów = stworzHodowlePsow(ileZwierzat);
        List<Ziemne> hodowlaZiemnych = stworzHodowleZiemnych(ileZwierzat);
        List<Zwierze> hodowlaZwierzat = stworzHodowleZwierzat(ileZwierzat);

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        for (int i = 0; i < hodowlaPsów.size(); i++) {
            Pies pies = hodowlaPsów.get(i);
            System.out.println(getPiesString(pies));
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        for (Ziemne ziemne : hodowlaZiemnych) {
            System.out.println(getZiemneString(ziemne));
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        hodowlaZwierzat.forEach(zwierze -> {
            if (zwierze instanceof Ziemne) {
                System.out.println(getZiemneString((Ziemne) zwierze));
            } else if (zwierze instanceof Wodne) {
                System.out.println(getWodneString((Wodne) zwierze));
            }
        });
    }

    private static String getPiesString(Pies pies) {
        return pies.getNazwa() + " " + pies.dajGlos() + " i " + pies.oddychaj();
    }

    private static String getWodneString(Wodne zwierze) {
        return zwierze.getNazwa() + " " + zwierze.plyn() + " i " + zwierze.oddychaj();
    }

    private static String getZiemneString(Ziemne zwierze) {
        return zwierze.getNazwa() + " " + zwierze.dajGlos() + " i " + zwierze.oddychaj();
    }

    private static List<Pies> stworzHodowlePsow(int ile) {
        List<Pies> list = new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            list.add(getNewPies(i));
        }
        return list;
    }

    private static List<Ziemne>  stworzHodowleZiemnych(int ile) {
        List<Ziemne> list = new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            list.add(getNewKon(i));
            list.add(getNewPies(i));
        }
        return list;
    }

    private static List<Zwierze>  stworzHodowleZwierzat(int ile) {
        List<Zwierze> list = new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            list.add(getNewKon(i));
            list.add(getNewPies(i));
            list.add(getNewRyba(i));
        }
        return list;
    }

    private static Pies getNewPies(int i) {
        return new Pies("pies_" + i);
    }

    private static Kon getNewKon(int i) {
        return new Kon("kon_" + i);
    }

    private static Ryba getNewRyba(int i) {
        return new Ryba("ryba_" + i);
    }
}