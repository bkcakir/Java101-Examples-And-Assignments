import java.util.Scanner;

public class EnKucukSayi {
    public static void main(String[] args) {
        int N,Sayi,Enk=1,Enb=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i+". Sayıyı giriniz:");
            Sayi = input.nextInt();
            if(Enb<Sayi)
            {
                Enb = Sayi;
            }
            else if (Enk>Sayi)
            {
            Enk = Sayi;
            }
        }
        System.out.println("En büyük sayı: "+Enb+"\n" +
                "En küçük sayı: "+Enk);
    }
}
