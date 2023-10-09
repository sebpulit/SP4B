package ify;

import java.util.Scanner;

public class zad18if {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Czy ktos jest na diecie wegetarianskiej");
        String dieta = klawiatura.nextLine();
        System.out.println("Czy ktos jest na diecie weganskiej");
        String dieta2 = klawiatura.nextLine();
        System.out.println("Czy ktos jest na diecie bezglutenowej");
        String dieta3 = klawiatura.nextLine();
        System.out.println("Mozecie sie wybrac do tych restauracji:");


        if (dieta.equals("nie")&&dieta2.equals("nie")&&dieta3.equals("nie")) {
            System.out.println("Luksusowe Burgery u Jarka");
        }
        if (dieta.equals("tak")&&dieta2.equals("nie")&&dieta3.equals("tak"))
        {
            System.out.println("Pizzeria przy Dworcowej");
        }
        if (dieta.equals("tak")&&dieta2.equals("tak")&&dieta3.equals("tak"))
        {
            System.out.println("Kawiarnia na rogu");
        }
        if (dieta.equals("tak")&&dieta2.equals("nie")&&dieta3.equals("nie"))
        {
            System.out.println("Wloskie Specjaly");
        }
        if (dieta.equals("tak")&&dieta2.equals("tak")&&dieta3.equals("tak"))
        {
            System.out.println("Kuchnia u Szefa");
        }
    }
}