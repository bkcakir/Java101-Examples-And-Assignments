import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int Sayi1,Sayi2,Kck;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi1: ");
        Sayi1 = input.nextInt();
        System.out.print("Sayi2: ");
        Sayi2 = input.nextInt();

        if(Sayi1 > Sayi2){
            Kck = Sayi1;
        }
        else{
            Kck = Sayi2;
        }
        int Ebob = 0;
        for (int i =1; i <= Kck; i++) {
            if(Sayi1%i==0 && Sayi2%i==0){
                Ebob = i;
            }
        }
        System.out.println("Bu ortak bölenlerin en büyüğü "+Ebob+ " sayısı EBOB’tur.");
        System.out.println("Bu ortak katlardan en küçüğü "+ ((Sayi1*Sayi2)/Ebob)+" sayısı EKOK’tur.");
    }
}
