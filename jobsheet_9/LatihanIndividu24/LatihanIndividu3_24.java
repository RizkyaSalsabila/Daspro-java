import java.util.Scanner;
public class LatihanIndividu3_24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Inisialisasi array nama bulan
        String bulan[] = {"Januari", "Februari", "Maret", "April", "Mei" , "Juni", "Juli", "Agustus", "September",
        "Oktober", "November", "Desember"};
        
        //Input salah satu angka (1 - 12)
        System.out.print("Isi salah satu angka (1 - 12) untuk melihat nama bulan : ");
        int n = input24.nextInt();

        //Pengecekan input menggunakan if else
        if (n > 0 && n < 13) {      //Jika benar, cetak nama bulan sesuai input
            System.out.println("Bulan ke - " + n + " adalah bulan " + bulan[n-1]); 
        } else {                    //Jika salah, coba lagi
            System.out.println("Angka yang Anda masukkan salah. Silahkan isi angka sesuai perintah !!");
        }

        input24.close();
    }
}