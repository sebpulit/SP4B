package ify;

import java.util.Scanner;

public class zad15if {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj ilosc czekow: ");
        double ilosc = klawiatura.nextDouble();
        double oplata=10;
        if (ilosc<20)
        {
            double cena_czek =0.1*ilosc+oplata;
            System.out.println("cena za "+ilosc + " czekow wynosi  "+cena_czek);
        }if (ilosc>20&&ilosc<39)
        {
            double cena_czek =0.08*ilosc+oplata;
            System.out.println("cena za "+ilosc + " czekow wynosi  "+cena_czek);
        }if (ilosc>40&&ilosc<59)
        {
            double cena_czek =0.06*ilosc+oplata;
            System.out.println("cena za "+ilosc + " czekow wynosi  "+cena_czek);
        }if (ilosc>60)
        {
            double cena_czek =0.04*ilosc+oplata;
            System.out.println("cena za "+ilosc + " czekow wynosi  "+cena_czek);
        }




    }
}