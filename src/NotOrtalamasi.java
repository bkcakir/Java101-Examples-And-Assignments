import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int Fizik, Kimya, Tarih,Turkce,Muzik;
        float NotOrtalamasi;
        Scanner input = new Scanner(System.in);
        System.out.print("Fizik notunu giriniz: ");
        Fizik = input.nextInt();
         if (Fizik<0 || Fizik>100) {
          System.out.println("Fizik Notunuzu Lütfen 0 ile 100 arasında bir not giriniz.");
          System.out.print("Fizik notunu Tekrar giriniz: ");
          Fizik = input.nextInt();
         }

        System.out.print("Kimya notunu giriniz: ");
        Kimya = input.nextInt();
        if (Kimya<0 || Kimya>100) {
            System.out.println("Kimya Notunuzu Lütfen 0 ile 100 arasında bir not giriniz.");
             System.out.print("Kimya notunu Tekrar giriniz: ");
             Kimya = input.nextInt();
        }

        System.out.print("Tarih notunu giriniz: ");
        Tarih = input.nextInt();
        if (Tarih<0 || Tarih>100) {
            System.out.println("Tarih Notunuzu Lütfen 0 ile 100 arasında bir not giriniz.");
             System.out.print("Tarih notunu Tekrar giriniz: ");
             Tarih = input.nextInt();
        }

        System.out.print("Turkce notunu giriniz: ");
        Turkce = input.nextInt();
        if (Turkce<0 || Turkce>100) {
            System.out.println("Turkce Notunuzu Lütfen 0 ile 100 arasında bir not giriniz.");
             System.out.print("Turkce notunu Tekrar giriniz: ");
              Turkce = input.nextInt();

        }

        System.out.print("Muzik notunu giriniz: ");
        Muzik = input.nextInt();
        if (Muzik<0 || Muzik>100) {System.out.println("Muzik Notunuzu Lütfen 0 ile 100 arasında bir not giriniz.");
                System.out.print("KimMuzika notunu Tekrar giriniz: ");
                Muzik = input.nextInt();
            
        }

        NotOrtalamasi=(Fizik+Kimya+Tarih+Turkce+Muzik)/5;
        System.out.println("[Fizik] [Kimya] [Tarih] [Türkçe] [Muzik] [NotOrtalamasi]\n"+"  ["+Fizik+"] "+"    ["+Kimya+"] "+"  ["+Tarih+"] "+"   ["+Turkce+"] "+"    ["+Muzik+"] "+"     ["+NotOrtalamasi+"]\n") ;

        System.out.print("Tekrar Durumunuz :");
        if (NotOrtalamasi >= 60) {
            System.out.println(" Tebrikler, geçtiniz!");
        } else {
            System.out.println(" Maalesef, kaldınız.");
        }
    }
}