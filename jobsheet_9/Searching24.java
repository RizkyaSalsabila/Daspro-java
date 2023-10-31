import java.util.Scanner;

public class Searching24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array : ");
        int n = input24.nextInt();
        
        //Deklarasi array berupa integer
        int[] arrayInt = new int[n];
        //Buat variabel hasil
        int hasil = 0;

        //Array loop untuk input elemen array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke - " + i + " : ");
            arrayInt[i] = input24.nextInt();
        }

        //input key yang ingin dicari
        System.out.print("Masukkan key yang ingin dicari : ");
        int key = input24.nextInt();

        //Array Loop sesuai panjang arrayInt
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        //Cetak posisi key dalam array
        System.out.println("Key ada di posisi indeks ke - " + hasil);

        input24.close();
    }
}