package wstep;

import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cene");
        double cena = klawiatura.nextDouble();
        double podatek=cena*0.0675;
        double napiwek=(podatek+cena)*0.2;
        System.out.println("Cena to "+cena);
        System.out.println("Podatek to "+podatek);
        System.out.println("Napiwek to "+napiwek);
        double suma= cena+podatek+napiwek;
        System.out.println("Cena koncowa to "+suma);


    }
}