import java.util.Scanner;
public class NilaiMhs24 {
    static int jumMhs, jumTugas;
    //Deklarasi dan instansiasi array 2 dimensi data
    static int data[][] = new int[jumMhs][jumTugas];
    //Deklarasi dan instansiasi array 1 dimensi nama
    static String nama[] = new String[jumMhs];
    //Deklarasi Scanner
    static Scanner input = new Scanner(System.in);
    

    //Fungsi inputDataMahasiswa
    static void inputDataMhs() {
        //Judul
        System.out.println("\nInput Data");
        System.out.println("============================================================");

        //Perulangan for bersarang untuk menginputkan nama mahasiswa dan nilai
        //For input nama
        for (int i = 0; i < data.length; i++) {     
            System.out.print("\nMasukkan data nilai mahasiswa ke - " + (i+1) + " atas nama ");
            System.out.print("");
            nama[i] = input.nextLine();
            //For input nilai
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Minggu ke - " + (j+1) + " : ");
                data[i][j] = input.nextInt();
                input.nextLine();
            }
        }
    }

    //Fungsi tampilDataMahasiswa
    static void tampilDataMhs() {
        //Judul
        System.out.println("\n\nTampil Data");
        System.out.println("============================================================");
        
        //Perulangan for bersarang untuk menampilkan nama dan nilai mahasiswa
        //For tampil nama
        for (int i = 0; i < data.length; i++) {
            System.out.print(nama[i] + "\t:\t");
            //For tampil nilai setiap mahasiswa
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Fungsi cariNilaiTertinggi
    static void cariNilTertinggi() {
        //Judul
        System.out.println("\n\nCari Nilai Tertinggi");
        System.out.println("============================================================");

        //Deklarasikan variabel
        int nilaiTinggi = data[0][0];
        int mingguKe = 1;

        //Perulangan For Bersarang
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > nilaiTinggi) {
                    nilaiTinggi = data[i][j];
                    mingguKe = j + 1;
                }
            }
        }
        System.out.println("Nilai tertinggi " + nilaiTinggi + " terletak pada minggu ke " + mingguKe);
    }

    //Fungsi tampilNilaiMahasiswaTertinggi
    static void tampilNilMhsTertinggi() {
        //Judul
        System.out.println("\n\nMahasiswa Nilai Tertinggi");
        System.out.println("============================================================");

        int nilaiTinggi = data[0][0];
        int mingguKe = 1;
        String mhs = nama[0];
        
        //Perulangan For Bersarang
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > nilaiTinggi) {
                    nilaiTinggi = data[i][j];
                    mingguKe = j + 1;
                    mhs = nama[i];
                }
            }
        }
        System.out.println("Nilai tertingi " + nilaiTinggi + " pada minggu ke " + mingguKe + " dimiliki oleh " + mhs);
    }

    //Fungsi method main
    public static void main(String[] args) {
        //input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumMhs = input.nextInt();
        //input jumlah tugas / minggu
        System.out.print("Masukkan jumlah tugas : ");
        jumTugas = input.nextInt();
        input.nextLine();

        inputDataMhs();     //Panggil fungsi inputDataMhs()
        tampilDataMhs();    //Panggil fungsi tampilDataMhs()
        cariNilTertinggi(); //Panggil fungsi cariNilTertinggi()
        tampilNilMhsTertinggi();    //Panggil fungsi tampilNilMhsTertinggi()
    }
}