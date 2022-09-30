import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Basamak Sayısını Giriniz : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i,j,k;

        for ( i=1 ; i<n ; i++){
            for(k=1 ; k<=i ; k++){
                System.out.print(" ");
            }
            for (j=1 ; j<= (2*(n-i))-1 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}