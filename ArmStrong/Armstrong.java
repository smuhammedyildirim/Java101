import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int basValue,basPow,basNumber=0,result=0;
        int number= scan.nextInt();
        int tempNumber=number;
        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
            for (int i=1 ; i<=basNumber ; i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }
        System.out.println("Sonuç : "+result);
        System.out.println("Basamak Sayısı : "+basNumber);
    }

}
