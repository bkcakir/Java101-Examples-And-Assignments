import java.util.Scanner;

public class ManavKasası {
    public static void main(String[] args) {
        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5,ToplamUcret=0,Kg;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        Kg = input.nextDouble();
        ToplamUcret = ToplamUcret + (Kg*Armut);

        System.out.print("Elma Kaç Kilo ? : ");
        Kg = input.nextDouble();
        ToplamUcret = ToplamUcret + (Kg*Elma);

        System.out.print("Domates Kaç Kilo ? : ");
        Kg = input.nextDouble();
        ToplamUcret = ToplamUcret + (Kg*Domates);

        System.out.print("Muz Kaç Kilo ? : ");
        Kg = input.nextDouble();
        ToplamUcret = ToplamUcret + (Kg*Muz);

        System.out.print("Patlıcan Kaç Kilo ? : ");
        Kg = input.nextDouble();
        ToplamUcret = ToplamUcret + (Kg*Patlican);

        System.out.print("Toplam Tutar : "+ToplamUcret+" TL");

    }
}
