import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args){
        int r,a;
        double pi=3.14;

        Scanner inp= new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz : ");
        r= inp.nextInt();
        System.out.print("Merkez Açısının Ölçüsünü Giriniz : ");
        a= inp.nextInt();
        double alan=(pi*a*(r*r))/360;
        System.out.println("a Açılı Bölgenin Alanı : "+alan);

    }
}
