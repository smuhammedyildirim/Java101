import java.util.Scanner;

public class ManavKasaHesap {
    public static void main(String[] args){
        int armutkg,elmakg,domateskg,muzkg,patlicankg;
        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5.00,Total;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo : ");
        armutkg = input.nextInt();
        System.out.print("Elma Kaç Kilo : ");
        elmakg = input.nextInt();
        System.out.print("Domates Kaç Kilo : ");
        domateskg = input.nextInt();
        System.out.print("Muz Kaç Kilo : ");
        muzkg = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo : ");
        patlicankg = input.nextInt();

        Total=((armutkg*Armut)+(elmakg*Elma)+(domateskg*Domates)+(muzkg*Muz)+(patlicankg*Patlican));
        System.out.println("Toplam Tutar : "+Total);


    }
}
