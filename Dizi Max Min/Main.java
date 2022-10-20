import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {34, 12, 45, 64, 8, 76, 98, -23, 67,436};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.print("Girilen Sayı : ");
        int number = input.nextInt();

        Arrays.sort(list);
        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Minimum Değere Eakın En Küçük Sayı : " +min);
        System.out.println("Maximum Değere Yakın En Büyük Sayı : " +max);

    }
}