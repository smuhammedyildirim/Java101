import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, ntotal = 1, rtotal = 1, ktotal = 1;

        Scanner xy = new Scanner(System.in);
        System.out.print("n Değerini Giriniz : ");
        n = xy.nextInt();
        System.out.print("r Değerini Giriniz : ");
        r = xy.nextInt();

        for (int i = 1; i <= n; i++) {
                ntotal = ntotal * i;
            }
        for (int j = 1; j <= r; j++) {
                rtotal = rtotal * j;
            }
        for (int k = 1; k <= (n - r); k++) {
                ktotal = ktotal * k;
            }
        System.out.println("C(n,r) = " + ntotal / (rtotal * (ktotal)));
    }
}