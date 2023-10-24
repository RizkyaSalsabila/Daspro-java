import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Deklarasi array nilaiAkhir bertipe int
        int[] nilaiAkhir = new int[10];

        //Perulangan FOR untuk menerima input dan mengisi elemen array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke- " + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        //Perulangan FOR
        for (int i = 0; i < nilaiAkhir.length; i++) {
            //Pemilihan if else untuk menentukan kelulusan
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke - " + i + " lulus!");
            } else {
                System.out.println("Mahasiswa ke - " + i + " tidak lulus!");
            }
        }

    }
}