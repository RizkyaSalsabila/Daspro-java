import java.util.Scanner;

public class Mandiri2_24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);
        
        //Buat Variabel
        String hari, jenisBuku;
        int jumlahBuku, diskon = 0, disTambahan = 0, totDiskon = 0;
         
        //Input Hari, jenisBuku, jumlahBuku
        System.out.println("Hari apa sekarang ?  ");
        hari = input24.nextLine();
        System.out.println("Masukkan Jenis Buku : ");
        jenisBuku = input24.nextLine();
        System.out.println("Masukkan Jumlah Buku : ");
        jumlahBuku = input24.nextInt();
        
        //Pemilihan Bersarang
        if (hari.equalsIgnoreCase("Rabu")) {
            System.out.println("\nSelamat Anda mendapatkan potongan diskon");
            if ((jenisBuku.equalsIgnoreCase("Kamus")) || (jenisBuku.equalsIgnoreCase("Novel"))) {    //Penggunaan Operator Logika
                if (jenisBuku.equalsIgnoreCase("Kamus")) {
                    diskon = 10;
                    if (jumlahBuku > 2) {
                        disTambahan = 2;
                    }
                } else {
                    diskon = 7;
                    if (jumlahBuku > 3) {
                        disTambahan = 2;
                    } else {
                        disTambahan = 1;
                    }
                }
             } else {
                if (jumlahBuku > 3) {
                    diskon = 5;
                } else {
                    System.out.println("Anda tidak mendapat potongan diskon");
                }
            }
            
        } else {
           System.out.println("Maaf Anda tidak mendapat potongan Diskon. Diskon berlaku setiap hari Rabu"); //Output diskon selain hari rabu
        }     
        input24.close();

        //Rumus Total Diskon
        totDiskon = diskon + disTambahan;
        //Output Total Diskon
        System.out.println("Jumlah Diskon yang Anda dapatkan sebesar " + totDiskon + "%");
    
    }
}