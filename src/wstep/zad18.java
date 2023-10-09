package wstep;

public class zad18 {
    public static void main(String[] args) {
        int iloscAkcji=600;
        double CenaAkcji=21.77;
        double prowizja=0.02;
        double suma=iloscAkcji*CenaAkcji;
        double suma2=suma*prowizja;
        double suma3=suma2+suma;
        System.out.println("Kwota za same akcje "+suma);
        System.out.println("Cena prowizji "+suma2);
        System.out.println("Kwota z prowizja "+suma3);

    }
}