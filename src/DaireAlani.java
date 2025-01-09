import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double Pi=3.14,Alan;
        int R,A;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı Çapını Giriniz");
        R = input.nextInt();
        System.out.println("Dairenin merkez Açısını Giriniz");
        A = input.nextInt();
        Alan=(Pi*(R*R)*A)/360;
        System.out.println(Alan);

    }
}
