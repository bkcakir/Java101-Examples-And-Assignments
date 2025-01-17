import java.util.Scanner;

public class GelismisHesapMakinesi{

    static void Toplama() {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("A Sayısını Giriniz: ");
        A = sc.nextInt();
        System.out.print("B Sayısını Giriniz: ");
        B = sc.nextInt();
        int Sonuc = A + B;
        System.out.println("Toplama Sonucu: " + Sonuc);
    }

    static void Cikarma() {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("A Sayısını Giriniz: ");
        A = sc.nextInt();
        System.out.print("B Sayısını Giriniz: ");
        B = sc.nextInt();
        int Sonuc = A - B;
        System.out.println("Çıkarma Sonucu: " + Sonuc);
    }

    static void Carpma() {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("A Sayısını Giriniz: ");
        A = sc.nextInt();
        System.out.print("B Sayısını Giriniz: ");
        B = sc.nextInt();
        int Sonuc = A * B;
        System.out.println("Çarpma Sonucu: " + Sonuc);
    }

    static void Bolme() {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("A Sayısını Giriniz: ");
        A = sc.nextInt();
        System.out.print("B Sayısını Giriniz: ");
        B = sc.nextInt();
        if (B != 0) {
            double Sonuc = (double) A / B;
            System.out.println("Bölme Sonucu: " + Sonuc);
        } else {
            System.out.println("Hata: Sıfıra bölme işlemi yapılamaz.");
        }
    }

    static void Ust() {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban Sayısını Giriniz: ");
        A = sc.nextInt();
        System.out.print("Üst Sayısını Giriniz: ");
        B = sc.nextInt();
        int Sonuc = 1;
        for (int i = 0; i < B; i++) {
            Sonuc *= A;
        }
        System.out.println("Üs Alma Sonucu: " + Sonuc);
    }

    static void Faktoriyel() {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Faktoriyelini Almak İstediğiniz Sayıyı Giriniz: ");
        N = sc.nextInt();
        int Tpl = 1;
        for (int i = 1; i <= N; i++) {
            Tpl *= i;
        }
        System.out.println("Faktöriyel Sonucu: " + Tpl);
    }

    static void ModAlma() {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz (A): ");
        A = sc.nextInt();
        System.out.print("İkinci Sayıyı Giriniz (B): ");
        B = sc.nextInt();
        if (B != 0) {
            int Sonuc = A % B;
            System.out.println("A % B Sonucu: " + Sonuc);
        } else {
            System.out.println("Hata: Sıfıra bölme işlemi yapılamaz.");
        }
    }

    static void Dikdortgen() {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.print("Uzun Kenarı Giriniz (A): ");
        A = sc.nextInt();
        System.out.print("Kısa Kenarı Giriniz (B): ");
        B = sc.nextInt();
        int Alan = A * B;
        int Cevre = 2 * (A + B);
        System.out.println("Dikdörtgenin Alanı: " + Alan);
        System.out.println("Dikdörtgenin Çevresi: " + Cevre);
    }

    public static void main(String[] args) {
        int Select;
        Scanner sc = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            Select = sc.nextInt();

            switch (Select) {
                case 1:
                    Toplama();
                    break;
                case 2:
                    Cikarma();
                    break;
                case 3:
                    Carpma();
                    break;
                case 4:
                    Bolme();
                    break;
                case 5:
                    Ust();
                    break;
                case 6:
                    Faktoriyel();
                    break;
                case 7:
                    ModAlma();
                    break;
                case 8:
                    Dikdortgen();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (Select != 0);

        sc.close();
    }
}
