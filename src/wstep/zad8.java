package wstep;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int PolePomieszczenia1;
        int PolePomieszczenie2;
        int PolePomieszczenie3;
        int PolePomieszczenia4;
        int PowierzchniaCala;
        int wymiar1;
        System.out.println("Podaj dlugosc 1 pokoju: ");
        wymiar1 = klawiatura.nextInt();
        int wymiar2;
        System.out.println("Podaj szerokosc 1 pokoju: ");
        wymiar2 = klawiatura.nextInt();
        int wymiar3;
        System.out.println("Podaj dlugosc 2 pokoju: ");
        wymiar3 = klawiatura.nextInt();
        int wymiar4;
        System.out.println("Podaj szerokosc 2 pokoju: ");
        wymiar4 = klawiatura.nextInt();
        int wymiar5;
        System.out.println("Podaj dlugosc 3 pokoju: ");
        wymiar5 = klawiatura.nextInt();
        int wymiar6;
        System.out.println("Podaj szerokosc 3 pokoju: ");
        wymiar6 = klawiatura.nextInt();
        int wymiar7;
        System.out.println("Podaj dlugosc 4 pokoju: ");
        wymiar7 = klawiatura.nextInt();
        int wymiar8;
        System.out.println("Podaj szerokosc 4 pokoju: ");
        wymiar8 = klawiatura.nextInt();
        int IloscOsob=4;
        PolePomieszczenia1 = wymiar1 * wymiar2;
        PolePomieszczenia4 = wymiar3 * wymiar4;
        PolePomieszczenie2 = wymiar5 * wymiar6;
        PolePomieszczenie3 = wymiar7 * wymiar8;
        PowierzchniaCala = PolePomieszczenia1 + PolePomieszczenie2 +
                PolePomieszczenie3 + PolePomieszczenia4;
        System.out.println("Pole 1 pokoju " + PolePomieszczenia1);
        System.out.println("Pole 2 pokoju " + PolePomieszczenie2);
        System.out.println("Pole 3 pokoju " + PolePomieszczenie3);
        System.out.println("Pole 4 pokoju " + PolePomieszczenia4);
        System.out.println("Pole domu " + PowierzchniaCala);
        double PowierzchniaNaOsobe=(double) PowierzchniaCala/IloscOsob;
        System.out.println("Pole domu na osobe " + PowierzchniaNaOsobe);


    }
}