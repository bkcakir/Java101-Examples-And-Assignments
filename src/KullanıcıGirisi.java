import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String KullaniciAdi="Burakkaanckr",KullaniciSifre="123456";
        String E;
        System.out.print("Kullanıcı Adını Giriniz : ");
        KullaniciAdi = inp.nextLine();
        System.out.print("Şifreniz Giriniz : ");
        KullaniciSifre = inp.nextLine();

        if (KullaniciAdi.equals("Burakkaanckr") && KullaniciSifre.equals("123456")) {
            System.out.println(KullaniciAdi + " Hoşgeldiniz");
        }
        else {
            System.out.print("Şifreniz Hatalı Değiştirmek istermisiniz Evet/Hayır");
            E = inp.nextLine();
            if (E.equals("Evet"))
            {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                KullaniciSifre = inp.nextLine();
                if (KullaniciSifre.equals("123456"))
                {
                    System.out.print("Eski Şifrenizi Giridiniz");
                }
                else {
                    System.out.print("Şifre oluşturuldu");
                }
            }
        }
    }
}
