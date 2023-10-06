import java.util.Scanner;
public class HargaBayar24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        //Buat variabel harga, jumlah, dis, total, bayar, jmlDis, jumlahHalBuku, merkBuku
        int harga, jumlah, jumlahHalBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("-------Informasi Buku-------");
        //Masukkan merk buku
        System.out.print("Masukkan Merk Buku : ");
        merkBuku = input.nextLine();
        //Masukkan jumlah halaman buku
        System.out.print("Masukkan Jumlah Halaman Buku : ");
        jumlahHalBuku = input.nextInt();

        System.out.println("\n-------STRUK PEMBELIAN BUKU-------");
        //Masukkan harga barang
        System.out.print("Masukkan Harga Barang yang dibeli (perbuku) : Rp " );
        harga = input.nextInt();

        //Masukkan jumlah barang
        System.out.print("Masukkan jumlah barang yang dibeli ");
        jumlah = input.nextInt();

        //Masukkan besaran diskon
        System.out.print("Masukkan Besaran Diskon : ");
        dis = input.nextDouble();

        //Rumus total, jmlDis, bayar
        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("\n-------STRUK PEMBAYARAN BUKU-------");
        //Hasil Diskon yang diterima
        System.out.println("Diskon yang Anda dapatkan adalah Rp " + jmlDis);

        //Output Total Jumlah yang dibayar
        System.out.println("Jumlah yang harus dibayar adalah Rp " + bayar);
    }
}