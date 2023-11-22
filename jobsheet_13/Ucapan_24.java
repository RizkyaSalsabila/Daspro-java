import java.util.Scanner;
public class Ucapan_24 {
    //Buat fungsi PenerimaUcapan
    public static String PenerimaUcapan() {
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);
        //Masukkan nama orang
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        //Pengembalian nilai menggunakan keyword return
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you");
    }
}