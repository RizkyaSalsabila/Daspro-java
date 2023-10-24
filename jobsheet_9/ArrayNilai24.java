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

        //Perulangan FOR, jika kondisi nilai > 70 maka cetak lulus
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke - " + i + " lulus !");
            }
        }

    }
}