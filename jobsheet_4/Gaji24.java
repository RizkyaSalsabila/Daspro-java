import java.util.Scanner;
public class Gaji24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        //Buat variabel jmlMasuk, jmlTdkMasuk, TotGaji, gaji, potGaji
        int jmlMasuk, jmlTdkMasuk, TotGaji, gaji, potGaji;

        //Masukkan jumlah hari masuk
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();

        //Masukkan jumlah hari tidak masuk
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        jmlTdkMasuk = input.nextInt();

        //Masukkan gaji awal
        System.out.print("Masukkan Gaji Awal : Rp ");
        gaji = input.nextInt();
        
        //Masukkan potongan gaji
        System.out.print("Masukkan Potongan Gaji Anda : Rp ");
        potGaji = input.nextInt();

        //Rumus Total Gaji
        TotGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);

        //Hasil Gaji yang diterima
        System.out.print("\nGaji yang Anda terima adalah sebesar Rp " + TotGaji);
    }
}