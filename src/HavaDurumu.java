import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
       int HavaDurumu;
       Scanner input = new Scanner(System.in);
       System.out.print("Hava Durumu Giriniz : ");
       HavaDurumu = input.nextInt();

       if(HavaDurumu<5)
       {
           System.out.println("Sıcaklık : "+HavaDurumu +" Önerimiz : Kayak");
       }
       else if (HavaDurumu>=5 && HavaDurumu<15)
       {
           System.out.println("Sıcaklık : "+HavaDurumu +" Önerimiz : Sinema");
       }
       else if (HavaDurumu>=15 && HavaDurumu<25)
       {
           System.out.println("Sıcaklık : "+HavaDurumu +" Önerimiz : Piknik");
       }
       else if (HavaDurumu>=25)
       {
           System.out.println("Sıcaklık : "+HavaDurumu +" Önerimiz : Yüzme");
       }

    }

}
