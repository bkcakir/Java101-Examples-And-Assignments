import java.util.Scanner;

public class DikUcgende {
    public static void main(String[] args) {
        int A, B, C;
        double U, Alan;
        Scanner sc = new Scanner(System.in);

        System.out.print("A Kenarı Giriniz: ");
        A = sc.nextInt();
        System.out.print("B Kenarı Giriniz: ");
        B = sc.nextInt();
        System.out.print("C Kenarı Giriniz: ");
        C = sc.nextInt();

        U = (A + B + C) / 2.0; // Yarı çevre (double olmalı)
        Alan = Math.sqrt(U * (U - A) * (U - B) * (U - C)); // Heron formülü

        System.out.println("Üçgenin Alanı: " + Alan);
    }
}
