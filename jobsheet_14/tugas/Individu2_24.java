import java.util.Scanner;
public class Individu2_24 {
    //Deklarasi variabel
    static int tambah = 0;
    static String hasil = "";

    //Fungsi PenjumlahanRekursif
    static int PenjumlahanRekursif(int n) {
        tambah++;
        if (n == 0) {
            System.out.print(hasil);
            return 0;
        } else {
            if (n > 1) {
                hasil += tambah + " + ";
            } else {
                hasil += tambah + " = ";
            }
            int output = PenjumlahanRekursif(n - 1); 
            return n + output;
        }
    }

    //Fungsi main
    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);
        //Input angka
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        //Cetak
        System.out.println("\nHasil Penjumlahan : ");
        System.out.print(PenjumlahanRekursif(angka));

        sc.close();
    }
}