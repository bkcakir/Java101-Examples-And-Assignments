import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int Mesafe,Yas,YolculukTuru;
        double Ucret,NormalUcret,YasIndirimi = 0,Indirim = 0,GidisDonus = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        Mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        Yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        YolculukTuru = input.nextInt();

        if(Mesafe>0)
        {
            NormalUcret = Mesafe*0.10;
            if(Yas<12)
            {
                YasIndirimi = NormalUcret*0.5;
                NormalUcret = NormalUcret-YasIndirimi;
            }
            else if (Yas>12 && Yas<24) {
                YasIndirimi = NormalUcret*0.1;
                NormalUcret = NormalUcret-YasIndirimi;
            }
            else if (Yas>65){
                YasIndirimi = NormalUcret*0.3;
                NormalUcret = NormalUcret-YasIndirimi;
            }

            if(YolculukTuru==2)
            {
                GidisDonus = Indirim*0.2;
                Ucret = (Indirim-GidisDonus)*2;
                System.out.print("Normal Tutar: "+NormalUcret+"\n"
                        + "Yaş İndirimi: " + YasIndirimi+"\n"
                        + "İndirimli Tutar: " + Indirim+"\n"
                        + "Gidiş Dönüş Bilet İndirimi: " +GidisDonus+"\n"
                        + "--------------------------- \n"
                        + "Toplam Tutar : "+Ucret+"\n");
            }
            else {
                
                Ucret = (NormalUcret-Indirim);
                System.out.print("Normal Tutar: "+NormalUcret+"\n"
                        + "Yaş İndirimi: " + YasIndirimi+"\n"
                        + "İndirimli Tutar: " + Indirim+"\n"
                        + "Gidiş Dönüş Bilet İndirimi: " +GidisDonus+"\n"
                        + "--------------------------- \n"
                        + "Toplam Tutar : "+Ucret+"\n");
            }
        }
        else {
            System.out.println(
                    "Hatalı Veri Girdiniz !"
            );
        }

    }
}
