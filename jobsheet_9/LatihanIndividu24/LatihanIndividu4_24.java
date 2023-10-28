import java.util.Scanner;
public class LatihanIndividu4_24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Instansiasi bilangan bulat dengan jumlah 8 elemen
        int bilBulat[] = new int[8];
        //Buat variabel total, rata2
        int total = 0;
        double rata2 = 0;

        System.out.println("Masukkan bilangan bulat sebanyak 8 kali ke dalam array\n");
        //Array Loop untuk input bilangan bulat sebanyak 8 elemen
        for (int i = 0; i < bilBulat.length; i++) {
            System.out.print("Bilangan bulat ke - " + (i+1) + " : ");
            bilBulat[i] = input24.nextInt();
            total += bilBulat[i];
        }

        //Rumus rata2
        rata2 = (double) total / 8;

        //Cetak rata2 keseluruhan
        System.out.println("\nRata - rata dari seluruh elemen array adalah " + rata2);
        input24.close();
    }
}