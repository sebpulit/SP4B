package ify;

import java.util.Scanner;

public class zad4if {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wynik testu: ");
        int wynik1 = klawiatura.nextInt();
        System.out.println("Podaj wynik testu: ");
        int wynik2 = klawiatura.nextInt();
        System.out.println("Podaj wynik testu: ");
        int wynik3 = klawiatura.nextInt();
        int ilosc=3;
        int suma = (wynik1 + wynik2 + wynik3)/ilosc;
        System.out.println("twoja srednia to "+suma);
        if (suma > 90 && suma < 100) {
            System.out.println("towja ocena to 5");
        }        if (suma > 80 && suma < 89) {
            System.out.println("towja ocena to 4");
        }        if (suma > 70 && suma < 79) {
            System.out.println("towja ocena to 3");
        }        if (suma > 60 && suma < 69) {
            System.out.println("towja ocena to 2");
        }        if (suma < 60) {
            System.out.println("towja ocena to 1");
        }
    }
}