import java.util.Scanner;
public class Bank24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double  prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukkan jumlah tabungan awal Anda");
        jml_tabungan_awal = sc.nextInt();
        System.out.println("Masukkan lama menabung Anda");
        lama_menabung = sc.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah Tabungan Akhir Anda adalah " + jml_tabungan_akhir);

    }
}