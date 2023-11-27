import java.util.Scanner;
public class NilaiMhs24 {
    //Deklarasi dan instansiasi array 2 dimensi data
    static int data[][] = new int[5][7];
    //Deklarasi dan instansiasi array 1 dimensi nama
    static String nama[] = new String[5];

    //Fungsi inputDataMahasiswa
    static void inputDataMhs() {
        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);
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

    //Fungsi method main
    public static void main(String[] args) {
        inputDataMhs();     //Panggil fungsi inputDataMhs()
    }
}