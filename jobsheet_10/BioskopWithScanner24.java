import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {

        //Deklarasikan Scanner
        Scanner input24 = new Scanner(System.in);

        //Buat variabel 
        int baris, kolom;
        String nama, next;

        //Deklarasi dan instansiasi array 2 dimensi penonton
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = input24.nextLine();
            System.out.print("Masukkan baris : ");
            baris = input24.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = input24.nextInt();
            input24.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = input24.nextLine();

            if (next.equalsIgnoreCase("n")) {   
                break;
            }
        }
        input24.close();
    }
}