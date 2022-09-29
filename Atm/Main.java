import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usarName,password;
        Scanner inp=new Scanner(System.in);
        int right =3;
        int balance = 2000;
        int select;

        while (right>0){
        System.out.print("Kullanıcı Adı : ");
        usarName=inp.nextLine();
        System.out.print("Parola : ");
        password= inp.nextLine();
        if (usarName.equals("yildirim") && password.equals("asd123")){
            System.out.println("Hoş Geldiniz.");
           do {

               System.out.println("1-) Para Yatırma\n" +
                       "2-)Para Çekme\n" +
                       "3-)Bakiye Sorgula\n" +
                       "4-)Çıkış Yap");
               System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
               select= inp.nextInt();
               if (select==1){
                   System.out.print("Para Miktarı : ");
                   int price = inp.nextInt();
                   balance+=price;
               }else if(select==2){
                   System.out.print("Para Miktarı : ");
                   int price = inp.nextInt();
                   if(price>balance){
                       System.out.println("Bakiye Yetersiz");
                   }else {
                       balance-=price;
                   }
               } else if (select==3){
                   System.out.println("Bakiyeniz : "+balance);
               }
           }while (select!=4);
            System.out.println("Tekrar Görüşmek Üzere");
           break;
        }else {
            right--;
            System.out.println("Hatalı Giriş Yaptınız Lütfen Tekrar Deneyiniz.");
            if (right==0){
                System.out.println("Hesabınız Bloke Olmuştur.");
            }else {
            System.out.println("Kalan Hakkınız : "+right);}

            }
        }
    }
}