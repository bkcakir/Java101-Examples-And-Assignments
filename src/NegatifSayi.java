import java.util.Scanner;

public class NegatifSayi {
    static void Negatif(int a, int original, boolean isIncreasing) {
        System.out.print(a + " ");

        if (a == original && isIncreasing) {
            return;
        }

        if (a > 0 && !isIncreasing) {
            Negatif(a - 5, original, false);
        } else {
            Negatif(a + 5, original, true);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int N = sc.nextInt();

        Negatif(N, N, false);
    }
}
