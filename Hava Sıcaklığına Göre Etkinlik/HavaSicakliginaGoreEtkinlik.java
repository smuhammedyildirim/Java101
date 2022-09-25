import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args){
        int heat;

        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklığı Giriniz");
        heat = input.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsiniz  ");
        } else if ((heat>=5)&&( heat<15)) {
            System.out.println("Sinemaya gidebilirsiniz  ");
        } else if ((heat>=15)&&(heat<25)) {
            System.out.println("Piknik yapabilirsiniz  ");
        }else if (heat<25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
  }
}

