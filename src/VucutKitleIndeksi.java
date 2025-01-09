import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Kg,Vki,Boy;
        System.out.print("Lütfen kilonuzu giriniz: ");
        Kg = input.nextDouble();
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        Boy = input.nextDouble();
        Vki=Kg/(Boy*Boy);
        System.out.print("Vücut Kitle İndeksiniz : " + Vki);
    }
}
