import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args){
        int number1,number2,total=1;

        Scanner x=new Scanner(System.in);
        System.out.print("1. Sayi : ");
        number1=x.nextInt();
        System.out.print("2. Sayi : ");
        number1=x.nextInt();


        for (int i=1 ; i<=number1 ; i++){
            total*=number1;

        }
        System.out.println("Cevap : "+total);
    }
}
