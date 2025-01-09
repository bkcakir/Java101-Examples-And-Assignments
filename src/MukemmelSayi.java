import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Sayi,Tpl=0;
        System.out.print("Sayi giriniz: ");
        Sayi = sc.nextInt();
        for (int i =1; i <= Sayi; i++) {
            if(Sayi%i==0 ){
                if(Tpl==Sayi)
                {
                    System.out.print(Sayi+" Mükemmel sayıdır");
                    break;
                }
                else if(Tpl>Sayi){
                    System.out.print(Sayi+" Mükemmel sayı değildir.");
                    break;
                }
                else {
                    Tpl+=i;
                }

            }
        }
    }
}
