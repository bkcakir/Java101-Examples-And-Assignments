import java.util.Scanner;

public class Desen {
    public static void main(String[] args) {
        int N,A;
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak Sayısı :");
        N = sc.nextInt();
        A=N;
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= A; j++) {
                System.out.print("*");
            }
            System.out.println();
            A--;
        }
    }
}
