public class Main {
    public static void main(String[] args) {
        String[][] dizi = new String[7][6];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    dizi[i][j] = "*";
                } else if (j == 0 || j == 5) {
                    dizi[i][j] = "*";
                } else {
                    dizi[i][j] = " ";
                }
            }
        }
        for (String[] a : dizi) {
            for (String b : a) {
                System.out.print(b);
            }
            System.out.println("");
        }
    }
}