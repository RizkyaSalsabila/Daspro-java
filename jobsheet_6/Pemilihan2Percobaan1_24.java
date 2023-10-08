import java.util.Scanner;

public class Pemilihan2Percobaan1_24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Variabel tahun
        int tahun;

        //Masukkan tahun
        System.out.print("Masukkan Tahun : ");
        tahun = input24.nextInt();

        //Pemilihan menggunakan percabangan bersarang
        if((tahun % 4) == 0) {
            if((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } 
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        input24.close();

    }
}