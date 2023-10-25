import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Deklarasi array nilaiMhs bertipe int
        int[] nilaiMhs = new int[10];
        //Deklarasi variable total, rata2
        double total = 0;
        double rata2;

        //Perulangan FOR untuk menerima input dan mengisi elemen array nilaiMhs
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        //Perulangan FOR untuk menghitung total nilai keseluruhan dalam array nilaiMhs 
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        //Rumus rata2
        rata2 = total / nilaiMhs.length;

        //Cetak rata2
        System.out.println("Rata - rata nilai = " + rata2);

    }
}
