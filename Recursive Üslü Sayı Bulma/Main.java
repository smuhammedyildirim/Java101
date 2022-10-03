import java.util.Scanner;

public class Main {
    static void usAlma(int taban, int us) {
        int sonuc = 1;
        while (us != 0) {
            sonuc *= taban;
            --us;
        }
        System.out.println("İşleminizin Sonucu = " +sonuc);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Sayısını Giriniz : ");
        int taban = scan.nextInt();
        System.out.print("Üs Sayısını Giriniz : ");
        int us = scan.nextInt();

        usAlma(taban, us);
    }
}

