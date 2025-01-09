import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int N,Tpl=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            Tpl*=i;
        }
        System.out.println(Tpl);
    }
}
