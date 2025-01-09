import java.util.Scanner;

public class Yildizlar {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        N = input.nextInt();

        for (int i = 0; i <= N ; i++) {
            for (int j = 0; j < (N - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
