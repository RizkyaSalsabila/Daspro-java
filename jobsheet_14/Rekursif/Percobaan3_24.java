import java.util.Scanner;
public class Percobaan3_24 {
    //Fungsi hitungLaba()
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    //Buat fungsi main
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        //Buat variabel bertipe double dan int
        double saldoAwal;
        int tahun;

        //Input saldo awal
        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc.nextInt();
        //Input lamanya tahun
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();

        //Cetak hasil
        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
        
        sc.close();
    }
}