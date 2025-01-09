import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int N,Tpl=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            Tpl+=i/1;
            System.out.print(i+"/"+1+" ");
            if(i!=N)
            {
                System.out.print("+ ");
            }
            else {
                System.out.print("= ");
            }
        }
        System.out.print(Tpl);

    }
}
