package ify;

import java.util.Scanner;

public class zad8_if {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);




        System.out.println("Podaj ilosc zakupionych produktow: ");
        double ilosc = klawiatura.nextDouble();
        double cena_pakietu=99;
        if (ilosc>10 && ilosc<19)
        {
            double rabat = cena_pakietu * 0.2*ilosc;
            double cena_po_rabacie = cena_pakietu *0.8;
            System.out.println("rabat wynosi "+rabat);
            double cena= ilosc* cena_po_rabacie;
            System.out.println("cena za "+ilosc + " pakietow wynosi "+cena);
        }        if (ilosc>20 && ilosc<49)
        {
            double rabat = cena_pakietu * 0.3 *ilosc;
            double cena_po_rabacie = cena_pakietu *0.7;
            System.out.println("rabat wynosi "+rabat);
            double cena= ilosc* cena_po_rabacie;
            System.out.println("cena za "+ilosc + " pakietow wynosi "+cena);
        }        if (ilosc>50 && ilosc<99)
        {
            double rabat = cena_pakietu * 0.4 *ilosc;
            double cena_po_rabacie = cena_pakietu *0.6;
            System.out.println("rabat wynosi "+rabat);
            double cena= ilosc* cena_po_rabacie;
            System.out.println("cena za "+ilosc + " pakietow wynosi "+cena);
        }        if (ilosc>100)
        {
            double rabat = cena_pakietu * 0.5 *ilosc;
            double cena_po_rabacie = cena_pakietu *0.5;
            System.out.println("rabat wynosi "+rabat);
            double cena= ilosc* cena_po_rabacie;
            System.out.println("cena za "+ilosc + " pakietow wynosi "+cena);
        }



    }
}