import java.util.Scanner;

public class Main {
    static void asalSayi(int sayi) {
        int conc = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                conc++;
            }
        }
        if (conc == 2) {
            System.out.println(sayi + " Bir Asal Sayıdır!");
        } else if (conc == 1) {
            System.out.println(sayi + " Bir Asal Sayı Değildir!");
        } else if (conc > 2) {
            System.out.println(sayi + " Bir Asal Sayı Değildir!");
        } else {
            System.out.println("Hatalı Giriş Yaptınız");

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Pozitif Bir Tam Sayı Giriniz : ");
        int input = scan.nextInt();
        asalSayi(input);
    }
}

