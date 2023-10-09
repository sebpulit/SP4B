package ify;

import java.util.Scanner;

public class zad5if {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);



        System.out.println("Podaj mase obiektu: ");
        double masa = klawiatura.nextDouble();

        double ciezar = masa * 9.8;

        if (ciezar>1000)
        {
            System.out.println("obiekt jest za ciezki");
        }
        if (ciezar<10)
        {
            System.out.println("obiekt jest za lekki");
        }

    }
}