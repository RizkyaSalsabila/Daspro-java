import java.util.Scanner;

public class LatihanIndividu1_24 {
    public static void main(String[] args) {

        //Deklarasi scanner
        Scanner input24 = new Scanner(System.in);

        //Instansiasi array dengan jumlah 60
        int array[] = new int[60];

        //Array Loop untuk input elemen sebanyak 60
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan angka ke- " + (i+1) + " : ");
            array[i] = input24.nextInt();
        }
        input24.close();

    }
}