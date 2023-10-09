package wstep;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        double marza=0.4;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna");
        double CenaDetaliczna = klawiatura.nextDouble();
        double zysk=CenaDetaliczna*marza;
        System.out.println("Zysk wynosi "+zysk);



    }
}