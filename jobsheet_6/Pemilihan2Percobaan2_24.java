import java.util.Scanner;

public class Pemilihan2Percobaan2_24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);
        
        //Variabel menggunakan tipe data float
        float sudut1, sudut2, sudut3, totalSudut;
        
        //Masukkan Sudut 1, sudut 2, sudut 3
        System.out.print("Masukkan Sudut 1 : ");
        sudut1 = input24.nextInt();
        System.out.print("Masukkan Sudut 2 : ");
        sudut2 = input24.nextInt();
        System.out.print("Masukkan Sudut 3 : ");
        sudut3 = input24.nextInt();

        //Proses totalSudut
        totalSudut = sudut1 + sudut2 + sudut3;

        //Pemilihan kondisi menggunakan if else
        if(totalSudut == 180) {
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut : Segitiga Siku - siku");
            } else if((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                System.out.println("Segitiga tersebut : Segitiga Sama Sisi");
            } else if((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3)) {
                System.out.println("Segitiga tersebut : Segitiga Sama Kaki");
            } else if((sudut1 != sudut2) && (sudut2 != sudut3) && (sudut1 != sudut3)) {
                System.out.println("Segitiga tersebut : Segitiga Sembarang");
            } else {
                System.out.println("Segitiga tersebut : Bukan Segitiga Siku - siku");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
        input24.close();

    }
}
