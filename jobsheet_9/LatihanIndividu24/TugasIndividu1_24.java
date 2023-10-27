import java.util.Scanner;

public class TugasIndividu1_24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Input banyaknya nilai
        System.out.print("Masukkan banyaknya nilai yang diinputkan : ");
        int n = input24.nextInt();

        //Inisialisasi array
        int array[] = new int[n];
        //Deklarasi variabel
        int max = 0, min = 0, total = 0;
        double rata2 = 0;

        //Array Loop untuk input nilai
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai ke - " + (i+1) + " : ");
            array[i] = input24.nextInt();
            total += array[i];

            if (array[i] > max) {   //nilai maksimal
                max = array[i];
            } else {                //nilai minimal
                min = array[i]; 
            }
        }

        //Rumus rata2
        rata2 = (double) total / n;

        //Cetak nilai maks, nilai min, nilai rata2
        System.out.println("\nNilai tertinggi : " + max);
        System.out.println("Nilai terendah : " + min);
        System.out.println("Nilai rata - rata keseluruhan : " + rata2);

        input24.close();
    }
}