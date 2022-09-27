import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner degisken=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        n=degisken.nextInt();

         for (int i=1 ; i<=n ; i*=4 ){
             System.out.println(i);

         }System.out.println("----------");
         for (int j=1 ; j<=n ; j*=5){
             System.out.println(j);
         }
    }

}