import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmBasiUcret = 2.20;
        double acilisUcreti = 10.0;
        double minimumUcret = 20.0;
        double mesafe, toplamUcret;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km olarak girin: ");
        mesafe = girdi.nextDouble();

        // Ücret hesaplama
        toplamUcret = acilisUcreti + (kmBasiUcret * mesafe);
        toplamUcret = Math.max(minimumUcret, toplamUcret);

        // Ücreti yazdır
        System.out.printf("Taksimetre Ücreti: %.2f TL\n", toplamUcret);
    }
}
