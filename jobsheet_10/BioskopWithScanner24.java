import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {

        //Deklarasikan Scanner
        Scanner input24 = new Scanner(System.in);

        //Buat variabel 
        int baris, kolom, menuInput;
        String nama, next;

        //Deklarasi dan instansiasi array 2 dimensi penonton
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n1. Input Data Penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3) : ");
            menuInput = input24.nextInt();
            input24.nextLine();

            System.out.println();

            switch (menuInput) {
                case 1:     //input nama penonton
                    do {
                        System.out.print("Masukkan nama : ");
                        nama = input24.nextLine();
                        System.out.print("Masukkan baris : ");
                        baris = input24.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = input24.nextInt();
                        input24.nextLine();

                        //Kondisi untuk menghandle kursi
                        if (baris > penonton.length || kolom > penonton.length) {
                            System.out.println("Maaf untuk baris / kolom kursi tidak tersedia\n");
                            continue;
                        }

                        //Warning kursi sudah terisi
                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Maaf kursi tersebut sudah terisi. Silahkan isi baris dan kolom kembali\n");
                            continue;
                        }
                         
                        System.out.println();
            
                        penonton[baris-1][kolom-1] = nama;
            
                        System.out.print("Input penonton lainnya? (y/n) : ");
                        next = input24.nextLine();
                        System.out.println();
            
                        if (next.equalsIgnoreCase("n")) {   
                            break;
                        }
                    } while (true);
                    break;
                case 2:     //tampilkan nama
                    System.out.println("Berikut adalah daftar nama penonton bioskop");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Penonton pada baris ke - " + (i+1) + " : ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            //jika kursi kosong, isi ***
                            if (penonton[i][j] == null) {
                                System.out.print("[" + "***" + "]");
                                continue;
                                
                            }
                            System.out.print("[" + penonton[i][j] + "] ");
                        }

                        System.out.println(); 
                    }
                    break;
                case 3:     //exit
                    return;
                default:
                System.out.println("Menu yang Anda masukkan salah. Silahkan coba lagi");
                    break;
            }
        }
    }
}