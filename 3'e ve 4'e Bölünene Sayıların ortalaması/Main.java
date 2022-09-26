import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,tortalama=0,sayi=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");

        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 12 == 0) {
                tortalama+=i;
                sayi+=1;
            }
    }
        System.out.print("Sonuç : " +tortalama/sayi);

}}
