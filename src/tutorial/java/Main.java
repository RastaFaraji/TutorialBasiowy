package tutorial.java;

import tutorial.java.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pies> hodowlaPsów = new ArrayList<>();
        List<Ziemne> hodowlaZiemnych = new ArrayList<>();
        List<Zwierze> hodowlaZwierzat = new ArrayList<>();

        int ileZwierzat = 3;

        stworzHodowlePsow(hodowlaPsów, ileZwierzat);
        stworzHodowleZiemnych(hodowlaZiemnych, ileZwierzat);
        stworzHodowleZwierzat(hodowlaZwierzat, ileZwierzat);


        System.out.println(hodowlaPsów.size());
        for (int i = 0; i < hodowlaPsów.size(); i++) {
            System.out.println(hodowlaPsów.get(i).getNazwa() + " " + hodowlaPsów.get(i).dajGlos() + " i " + hodowlaPsów.get(i).oddychaj());
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        System.out.println(hodowlaZiemnych.size());
        for (Ziemne ziemne : hodowlaZiemnych) {
            System.out.println(ziemne.getNazwa() + " "  + ziemne.dajGlos() + " i " + ziemne.oddychaj());
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println(hodowlaZwierzat.size());

        hodowlaZwierzat.forEach(zwierze -> {
            if (zwierze instanceof Ziemne) {
                System.out.println(zwierze.getNazwa() + " "  + ((Ziemne)zwierze).dajGlos() + " i " + zwierze.oddychaj());
            } else if (zwierze instanceof Wodne) {
                System.out.println(zwierze.getNazwa() + " "  + ((Wodne)zwierze).plyn() + " i " + zwierze.oddychaj());
            }
        });

    }

    private static void stworzHodowlePsow(List<Pies> list, int ile) {
        for (int i = 0; i < ile; i++) {
            list.add(new Pies("p" + i));
        }
    }

    private static void stworzHodowleZiemnych(List<Ziemne> list, int ile) {
        for (int i = 0; i < ile; i++) {
            list.add(new Pies("p" + i));
            list.add(new Kon("k" + i));
        }
    }

    private static void stworzHodowleZwierzat(List<Zwierze> list, int ile) {
        for (int i = 0; i < ile; i++) {
            list.add(new Pies("p" + i));
            list.add(new Kon("k" + i));
            list.add(new Ryba("r" + i));
        }
    }
}