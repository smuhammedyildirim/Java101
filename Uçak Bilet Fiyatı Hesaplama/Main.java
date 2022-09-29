import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double mesafeBasinaUcret = 0.10, yasIndirimi = 0, tipIndirimi = 0,
                biletIndirimi, toplamTutar, normalTutar, indirimliTutar;

        Scanner Input = new Scanner(System.in);
        System.out.print("Gidilecek Mesafeyi KM Türünden Giriniz  : ");
        mesafe = Input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = Input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = Input.nextInt();

        if ((mesafe > 0) && (yas > 0)) {
            if (yas < 12) {
                yasIndirimi = 0.5;
            } else if ((yas > 12) && (yas < 24)) {
                yasIndirimi = 0.1;
            } else if (yas > 65) {
                yasIndirimi = 0.3;
            }
            if (yolculukTipi == 1) {
                tipIndirimi = 0;
            } else if (yolculukTipi == 2) {
                tipIndirimi = 0.2;
            } else {
                System.out.print("Yolculuk Tipini Yanlış Girdiniz.");
            }
            normalTutar = (mesafe * mesafeBasinaUcret);
            indirimliTutar = normalTutar - (normalTutar * yasIndirimi);
            biletIndirimi = indirimliTutar * tipIndirimi;
            toplamTutar = (indirimliTutar - biletIndirimi) * yolculukTipi;

            System.out.print("Toplam Tutar = " + toplamTutar);
        } else {
            System.out.println("Hatalı Veri Girdiniz.");
        }
    }
}