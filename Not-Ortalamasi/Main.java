import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz:");
        Matematik = inp.nextInt();

        System.out.println("Fizik Notunuz:");
        Fizik = inp.nextInt();

        System.out.println("Kimya Notunuz:");
        Kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz:");
        Turkce = inp.nextInt();

        System.out.println("Tarih Notunuz:");
        Tarih = inp.nextInt();

        System.out.println("Müzik Notunuz:");
        Muzik = inp.nextInt();

        int toplam = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalama:" + sonuc);

        String str = sonuc < 60 ? "Kaldınız" : "Geçtiniz";
        System.out.println(str);
    }
}
