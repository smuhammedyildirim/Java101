import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int number1,total=1,number2;

        Scanner x=new Scanner(System.in);
        System.out.print("1. Sayi : ");
        number1=x.nextInt();
        System.out.print("2. Sayi : ");
        number2=x.nextInt();


        for (int i=1 ; i<=number2 ; i++){
            total*=number1;

        }
        System.out.println("Cevap : "+total);
    }
}
