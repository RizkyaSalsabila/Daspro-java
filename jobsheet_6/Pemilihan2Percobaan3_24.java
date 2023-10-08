import java.util.Scanner;
public class Pemilihan2Percobaan3_24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Buat variabel
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        //Masukkan Kategori dan Besarnya Penghasilan
        System.out.println("Masukkan kategori : ");
        kategori = input24.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input24.nextInt();

        //Pemilihan Bersarang
        if(kategori.equalsIgnoreCase("pekerja")) {
            if(penghasilan <= 2000000) {
                pajak = 0.1;
            } else if(penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        } else if(kategori.equalsIgnoreCase("pebisnis")) {
            if(penghasilan <= 2500000) {
                pajak = 0.15;
            } else if(penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
        } else {
            System.out.println("Masukan Kategori Salah");
        }
        input24.close();

        //Rumus gajiBersih
        gajiBersih = (int)(penghasilan - (pajak*penghasilan));
        //Output gajiBersih
         System.out.println("Hasil gaji bersih yang Anda terima sebesar Rp " + " " + gajiBersih);
    }
}
