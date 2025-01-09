import java.util.Scanner;

public class BolunenOrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin (N): ");
        int N = scanner.nextInt();

        int sum = 0;
        int count = 0;

        System.out.println("3 ve 4'e tam bölünen sayılar:");
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println();
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

        scanner.close();
    }
}
