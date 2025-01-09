import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double Fiyat,Kdv,KdvTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücreti Giriniz: ");
        Fiyat = input.nextDouble();

        if (Fiyat > 0 && Fiyat <= 1000) {
            Kdv =  0.18 * Fiyat;
            KdvTutar = Kdv +Fiyat;
        }
        else{
            Kdv =  0.08 * Fiyat;
            KdvTutar = Kdv +Fiyat;
        }
        System.out.println("[Fiyat]  [Kdv]  [Kdvli Fiyat]\n"+"["+Fiyat +"TL]" +"["+Kdv+" TL]" +"["+KdvTutar+" TL]");

    }
}
