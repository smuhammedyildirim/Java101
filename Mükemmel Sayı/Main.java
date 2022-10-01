import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                total += i;
            }
        }
        if (n == total) {
            System.out.println(n + "  mükemmel sayıdır.");
        } else {
            System.out.println(n + "  mükemmel sayı değildir.");
        }
    }
}
