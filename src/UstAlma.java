import java.util.Scanner;

public class UstAlma {
    static int UstAlma (int Ust,int Sayi) {
        int Sonuc=1;
        if (Sayi == 0)
        {
            return 1;
        }
        else {
            while (Ust > 0)
            {
                Sonuc*=Sayi;
                Ust--;
            }
        }
        return  Sonuc;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Taban ,Us;
        System.out.print("Taban değeri giriniz : ");
        Taban  = sc.nextInt();
        System.out.print("Üs değerini giriniz : ");
        Us= sc.nextInt();
        System.out.println("Sonuç : "+UstAlma(Us,Taban));
    }
}
