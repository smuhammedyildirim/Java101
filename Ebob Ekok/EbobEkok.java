import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını Giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1, ekok = 1;

        int i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0){

                ebob = i;
                System.out.println("Ebob = " + ebob);
                break;
            }
            i--;
        }
        int j = 1;
        while (j <= (n1 * n2)) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                System.out.println("Ekok = " + ekok);
                break;
            }
            j++;
        }

    }

}






