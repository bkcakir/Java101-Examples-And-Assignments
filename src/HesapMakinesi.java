import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double A,B,Islem;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("A Saysısını Giriniz : ");
        A = input.nextDouble();
        System.out.print("B Sayısını Giriniz : ");
        B = input.nextDouble();
        System.out.println("İslemler için İlgili Kodu Giriniz! \n" +
                "Toplama İçin : 1 \n" +
                "Çıkarma İçin : 2 \n" +
                "Çarpma için : 3 \n" +
                "Bölme  için : 4 \n");
        System.out.print("İşlem Kodunu Giriniz :");
        i = input.nextInt();

        if(i<5)
        {
            switch (i) {
                case 1:
                    Islem = A+B;
                    System.out.println(A +" + "+ B +" = " + Islem);
                    break;
                case 2:
                    Islem = A-B;
                    System.out.println(A +" - "+ B +" = " + Islem);
                    break;
                case 3:
                    Islem = B*A;
                    System.out.println(A +" * "+ B +" = " + Islem);
                    break;
                case 4:
                    Islem = B/A;
                    System.out.println(A +" / "+ B +" = " + Islem);
                    break;

            }
        }
        else
        {
            System.out.println("Lütfen Sistemi Yeniden Başlatın ve 1 ile 4 Arasında Bir Kod Giriniz");
        }


    }
}
