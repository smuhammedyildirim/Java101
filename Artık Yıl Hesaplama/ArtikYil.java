import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz : ");
        yil = input.nextInt();
        if ((yil % 100) == 0) {
            if ((yil % 400) == 0) {
                System.out.println(yil + " Bir artık yıldır ");
            } else {
                System.out.println(yil + " Bir artık yıldır değildir ");
            }
        } else {
            if ((yil % 4) == 0) {
                System.out.println(yil + " Bir artık yıldır ");
            } else {
                System.out.println(yil + " Bir artık yıldır değildir ");





        }
        }
    }
}