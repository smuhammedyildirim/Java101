import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  a = 0, b = 1, c;
        int n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            c=a+b;
            System.out.println(a+"+"+b+"="+c);
            a=b;
            b=c;
            System.out.println();
            i++;
        }
    }
}

