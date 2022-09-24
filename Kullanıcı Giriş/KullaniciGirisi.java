import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String kullaniciAdi, kullaniciSifre, sifirla, yeniSifre;
        String akullaniciAdi = "yildirim", akullaniciSifre = "yildirim123";
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        kullaniciAdi = inp.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        kullaniciSifre = inp.nextLine();

        if(kullaniciAdi.equals(akullaniciAdi) && kullaniciSifre.equals(akullaniciSifre)) {
            System.out.println("Giriş Başaraılı");
        }
        else {
            System.out.print("Kullanıcı adı veya şifreniz hatalı.\n" +
                    "Şifrenizi sıfırlamak istiyorsanız lütfen evet yazınız. : ");
            sifirla = inp.nextLine();
            if (sifirla.equals("evet")) {
                System.out.print("Yeni şifre giriniz : ");
                yeniSifre = inp.nextLine();
                while (yeniSifre.equals(akullaniciSifre)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                    yeniSifre = inp.nextLine();
                }
                System.out.println("Yeni Şifreniz : " + yeniSifre);
            }
            else{
                System.out.println("Giriş Başarısız");


            }
        }
    }
}