import java.util.Scanner;

public class Min_Max_Hesaplama {
    public static void main(String[] args ){
        Scanner x = new Scanner(System.in);
        int n,number,min=999999999,max=0;
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n= x.nextInt();

        for (int i=1 ; i<=n ; i++ ){
            System.out.print(i+". Sayıyı Giriniz : ");
            number=x.nextInt();

            if (number>max){
                max=number;
            }
            if (number<min){
                min=number;
            }
            if (number==8){
                min=number;
                max=number;
            }

        }
        System.out.println("En Büyük Sayı : " +max);
        System.out.println("En Küçük Sayı : " +min);
    }
}
