import java.util.Scanner;

public class VucutKiyleIndeks {
    public static void main(String[] args){
        double kilo,boy;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu (metre cinsinden) Giriniz : ");
        kilo= input.nextDouble();
        System.out.print("Lütfen Boyunuzu Giriniz : ");
        boy= input.nextDouble();
        double hesap= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksimiz : "+hesap);
    }

}



