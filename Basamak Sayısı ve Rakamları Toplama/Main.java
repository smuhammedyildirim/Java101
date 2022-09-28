import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int number = inp.nextInt();
        int basNumber=0,resault=0,basValue,tempNumber=number;

        while (tempNumber != 0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=number;
        while (tempNumber != 0){
            basValue = tempNumber % 10 ;
            resault+=basValue;
            tempNumber/=10;
        }
        System.out.println("Basamak Sayısı : "+basNumber);
        System.out.println("Rakamları Toplamı : "+resault);
    }

}
