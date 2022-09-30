import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir Sayı Giriniz : ");
        int n= scan.nextInt();
        System.out.print("2\n3\n5\n7\n");
        for (int i=2 ; i<=n ; i++){
            if (i%2==1  &&  (i%3==1 || i%3==2) &&
                    (i%5==1 ||i%5==2 ||i%5==3 || i%5==4)  &&
                    (i%7==1 || i%7==2 || i%7==3 || i%7==4 || i%7==5 || i%7==6)){
                System.out.println(i);
            }
        }

    }
}