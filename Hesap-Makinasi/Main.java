import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n1,n2,select;

        Scanner inp=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1= inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2= inp.nextInt();

        System.out.println("1-Toplam \n2-Çıkarma \n3-Çarpma \n4-Bölme ");
        System.out.println("Seçiminiz : ");
        select= inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç : "+(n1+n2));
                break;
            case 2:
                System.out.println("Sonuç : "+(n1-n2));
                break;
            case 3:
                System.out.println("Sonuç : "+(n1*n2));
                break;
            case 4:
                System.out.println("Sonuç : "+(n1/n2));
                break;
        }
    }
}