import java.util.Scanner;

public class Kuwetler {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin (N): ");
        N = input.nextInt();

        System.out.print("2'nin Kuwetleri :");
        for (int i = 1; i <= N; i*=2){
            System.out.print(i+"-");
        }
        System.out.println();
        System.out.print("4'nin Kuwetleri :");
        for (int i = 1; i <= N; i*=4){
            System.out.print(i+"-");
        }
        System.out.println();
        System.out.print("5'nin Kuwetleri :");


        for (int i = 1; i <= N; i*=5){
            System.out.print(i+"-");
        }
    }
}
