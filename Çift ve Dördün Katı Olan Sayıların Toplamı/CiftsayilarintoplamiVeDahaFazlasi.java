import java.util.Scanner;

public class CiftsayilarintoplamiVeDahaFazlasi {
    public static void main(String[] args) {
        int n, total = 0;

        Scanner x = new Scanner(System.in);

        n = x.nextInt();

        while (n % 2 == 0) {
            if (n % 4 == 0) {
                total += n;
            }
            System.out.print("Sayi Giriniz : ");
            n = x.nextInt();
        }
        System.out.print("Sayıların Toplamı : " + total);
    }
}

