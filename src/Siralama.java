import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a,b,c,enb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Sayi Giriniz : ");
        a = sc.nextInt();
        System.out.print("İkinci Sayi Giriniz  : ");
        b = sc.nextInt();
        System.out.print("Üçüncü Sayi Giriniz  : ");
        c = sc.nextInt();

        if(a>b && a>c) {
            if (b > c) {
                System.out.println("Büyükten Küçüge : " + a + ">" + b + ">" + c);
                System.out.println("Küçükten Büyüğe : " + c + "<" + b + "<" + a);
            } else {
                System.out.println("Büyükten Küçüge : " + a + ">" + b + ">" + c);
                System.out.println("Küçükten Büyüğe : " + c + "<" + b + "<" + a);
            }
        }
        else if(a<b && a<c) {
            if (c > a) {
                if (b > a) {
                    System.out.println("Büyükten Küçüge : " + c + ">" + b + ">" + a);
                    System.out.println("Küçükten Büyüğe : " + a + "<" + b + "<" + c);
                }
                else {
                    System.out.println("Büyükten Küçüge : " + c + ">" + a + ">" + b);
                    System.out.println("Küçükten Büyüğe : " + b + "<" + a + "<" + c);
                }
            }
        }
    }
}
