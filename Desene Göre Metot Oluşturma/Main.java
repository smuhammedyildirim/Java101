import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n sayısı : ");

        int number = scan.nextInt();
        minus(number, number);
    }

    public static int minus(int number, int tempNumber) {

        if (number > 0) {
            System.out.print(number + " ");
            return minus(number - 5, tempNumber);
        } else {
            return plus(number, tempNumber);
        }
    }

    public static int plus(int number, int tempNumber) {

        System.out.print(number + " ");
        if (number == tempNumber) {
            return number;
        } else {
            return plus(number + 5, tempNumber);
        }
    }
}