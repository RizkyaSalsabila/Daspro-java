import java.util.Scanner;

public class NestedLoop_2341720056 {
    public static void main (String[] args) {
        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        //Deklarasi dan instansiasi array temps
        Double[][] temps = new Double[5][7];

        //Input menggunakan perulangan bersarang
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke - " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke - " + (j+1) + " : ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        } 

        //Menampilkan menggunakan foreach
        int i = 0;
        for (Double[] outer : temps) {
            System.out.print("Kota ke - " + (i+1) + " : ");
            for (Double inner : outer) {
                System.out.print(inner + ", ");
            }
            System.out.println();
            i++;
        }

        input.close();
    }
}