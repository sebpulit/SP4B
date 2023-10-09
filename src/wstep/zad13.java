package wstep;

import java.util.Scanner;

public class zad13 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        int pudelko = 40;
        int porcja_kcal= 300;
        int porcja_ciastek =4;



        System.out.println("Podaj ile zjadles ciastek: ");
        int ciastka = klawiatura.nextInt();

        int jedno_kcal =porcja_kcal/porcja_ciastek;
        int suma = jedno_kcal * ciastka;


        System.out.println("zjadles "+ suma +"kcal" );


    }
}