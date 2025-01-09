import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int N,R,Tpl=1,Kmb=1,Snc=1;
            Scanner input = new Scanner(System.in);
            System.out.print("Küme Kaç Elemanlı :");
            N = input.nextInt();
            System.out.print("kombinasyon Sayısı :");
            R = input.nextInt();
            for (int i = 1; i <= N; i++) {
                Tpl *= i;
            }
            for (int i = 1; i <= R; i++) {
                Kmb *= i;
            }
            for (int i = 1; i <= N-R; i++){
                Snc *= i;
            }
            System.out.print("C("+N+","+R+") = " +Tpl/(Kmb*Snc));

        }
    }