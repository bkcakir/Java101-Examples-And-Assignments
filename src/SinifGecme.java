import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  Matematik, Fizik,Turkce, Kimya, Muzik;
        double Ortalama = 0;
        System.out.print("Matematik Giriniz : ");
        Matematik = sc.nextInt();
        System.out.print("Fizik Giriniz : ");
        Fizik = sc.nextInt();
        System.out.print("Turkce Giriniz : ");
        Turkce = sc.nextInt();
        System.out.print("Kimya Giriniz : ");
        Kimya = sc.nextInt();
        System.out.print("Muzik Giriniz : ");
        Muzik = sc.nextInt();

        if(Matematik>0&& Matematik<=100)
        {
            Ortalama += Matematik;
        }
        if (Fizik>0&& Fizik<=100)
        {
            Ortalama += Fizik;

        }
        if (Turkce > 0 && Turkce <= 100
        ) {
            Ortalama += Turkce;

        }
        if (Kimya > 0 && Kimya <= 100)
        {
            Ortalama += Kimya;

        }
        if (Muzik>0&&Muzik<=100)
        {
            Ortalama += Muzik;
        }
        if(Ortalama/5>55)
        {
            System.out.println("Sınıfı Geçtiniz Ortalamanız : "+Ortalama);
        }
        else {
            System.out.println("Sınıfta Kaldınız !! Ortalamanız : "+Ortalama);
        }


    }
}
