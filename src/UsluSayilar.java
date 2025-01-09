import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı Giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Üs Olacak Sayı Giriniz: ");
        sayi2 = input.nextInt();
        int Total=1;

        for (int i=1; i<=sayi2; i++){
            Total=Total*sayi1;
        }
        System.out.println(sayi1+"^"+sayi2 +"= "+Total);
    }
}
