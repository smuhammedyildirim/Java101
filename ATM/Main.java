import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usarName, password;
        Scanner xc = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;


        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            usarName = xc.nextLine();
            System.out.print("Parolanız : ");
            password = xc.nextLine();
            if (usarName.equals("Yildirim") && password.equals("asD123")) {
                System.out.println("Hoş Geldiniz ");

                System.out.println("1-) Para Çekme\n2-) Para Yatırma\n3-) Bakiye Sorgulama\n4-) Çıkış Yap");
                System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                select = xc.nextInt();
                switch (select) {

                    case 1:
                        System.out.print("Para Miktarı : ");
                        int price = xc.nextInt();
                        if (price > balance) {
                            System.out.println("Yetersiz Bakiye!");
                        } else {
                            balance -= price;
                            break;
                        }
                    case 2:
                        System.out.print("Para Miktarı : ");
                        int price1 = xc.nextInt();
                        balance += price1;
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar Görüşmek Üzere ");
                        break;
                }
            } else {
                right--;
                System.out.println("Lütfen Tekrar Deneyiniz");
                if (right==0){
                    System.out.println("Hesabınız Bloke Olmuştur!");
                }else{
                    System.out.println("Kalan Hakkınız : " +right);
            }
        }
    }
}
}
