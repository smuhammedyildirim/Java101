import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args){
       double  tutar,kdvTutari1,kdvTutari2,kdvliFiyat1,kdvliFiyat2, kdv1= 0.18, kdv2= 0.08, limit =1000;
       boolean sinir;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        sinir = tutar<=limit;

        kdvTutari1= tutar*kdv1;
        kdvliFiyat1=tutar+kdvTutari1;

        kdvTutari2= tutar*kdv2;
        kdvliFiyat2=tutar+kdvTutari2;
        String Fiyat = sinir ? ("%18 KDV'li Fiyat:" +kdvliFiyat1) : ("%8 KDV'li Fiyat:"+kdvliFiyat2);
        System.out.print(Fiyat);
    }
}