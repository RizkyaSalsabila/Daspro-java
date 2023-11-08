import java.util.Scanner;

public class NestedLoop_2341720056 {
    public static void main (String[] args) {
        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        //Deklarasi dan instansiasi array temps
        Double[][] temps = new Double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke - " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke - " + (j+1) + " : ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        input.close();
    }
}