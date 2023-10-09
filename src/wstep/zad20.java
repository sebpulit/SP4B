package wstep;

import java.util.Scanner;

public class zad20 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        double cukier = 1.5;
        double maslo= 1;
        double maka =2.75;
        double ciastka =48;



        System.out.println("Podaj ile chcesz ciastek: ");
        double ilosc_ciastka = klawiatura.nextDouble();

        double cukier2 = cukier/ciastka;
        double cukier3 = cukier2 * ilosc_ciastka;

        double maslo2 = maslo/ciastka;
        double maslo3 = maslo2 * ilosc_ciastka;

        double maka2 = maka/ciastka;
        double maka3 = maka2* ilosc_ciastka;




        System.out.println("potrzeba "+ cukier3 +" szklanek cukru" );
        System.out.println("potrzeba "+ maslo3 +" szlanek masla" );
        System.out.println("potrzeba "+ maka3 +" szklanek maki" );

    }
}