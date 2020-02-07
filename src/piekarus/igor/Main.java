package piekarus.igor;

import piekarus.igor.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ryba ryba = new Ryba("ryba");
        Pies pies = new Pies("pies");

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
        }
    }

    private static void stworzHodowleZwierzat(List<Zwierze> list, int ile) {
        for (int i = 0; i < ile; i++) {
            list.add(new Pies("p" + i));
            list.add(new Ryba("r" + i));
        }
    }
}


/*
Programik:
	- interface:
		- Zwierze
		- Wodne
		- Lądowe
	- klasy:
		- Ryba
		- Pies

Każde zwierze ma swoją nazwę (pole + metoda wyświetlająca)
Każde zwierze może oddychać (metoda wyświetla jakiś napis)
Lądowe mogą wydać dźwięk (metoda wyświetla jakiś napis)
Wodne mogą pływać (metoda wyświetla jakiś napis)
Dodatkowo dwa razy HodowlaZwierzat(lista), jedna tylko dla jednego gatunku, druga(generyczna) która przyjmuje wszystkie zwierzęta.
 */