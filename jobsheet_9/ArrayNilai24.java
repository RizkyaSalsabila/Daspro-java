import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Deklarasi array nilaiAkhir bertipe int
        int[] nilaiAkhir = new int[10];

        //Perulangan FOR untuk menerima input dan mengisi elemen array
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke- " + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        //Perulangan FOR untuk menampilkan semua isi elemen array
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke- " + i + " adalah " + nilaiAkhir[i]);
        }

    }
}