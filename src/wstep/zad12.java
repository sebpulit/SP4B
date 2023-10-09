package wstep;

import java.util.Scanner;

public class zad12 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);




        System.out.println("Podaj ile przejechales km: ");
        double km = klawiatura.nextDouble();

        System.out.println("Podaj ile zuzyles litrow paliwa ");
        double litry = klawiatura.nextDouble();

        double  kilometry_na_litr=km/litry;


        System.out.println("Zuzyles "+ kilometry_na_litr +
                " litrow plaiwa" );


    }
}