import java.util.Scanner;

public class UcgendeAlan {
    public static void main(String[] args){
       //Kenar 1=a Kenar 2=b Kenar 3=c

        int a,b,c;
        double cevre,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a=input.nextInt();
        System.out.println("2. Kenarı Giriniz : ");
        b=input.nextInt();
        System.out.println("3. Kenarı Giriniz : ");
        c=input.nextInt();
        cevre=a+b+c;
        alan=cevre/2+(cevre/2-a)*(cevre/2-b)*(cevre/2-c);
        System.out.println("Alan : "+alan);
    }
}
