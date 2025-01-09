import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int Yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        Yil = input.nextInt();
        if(Yil%4 == 0 && Yil%400 == 0)
        {
            System.out.println(Yil+" bir artık yıldır !");
        }
        else {
            System.out.println(Yil+" bir artık yıldır değildir !");
        }
    }
}
