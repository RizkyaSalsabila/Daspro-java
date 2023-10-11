import java.util.Scanner;

public class WhileKelipatan24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner scan = new Scanner(System.in);

        //Buat variabel baru
        int kelipatan, total = 0, counter = 0;
        float rataRata = 0;

        //Input bilangan kelipatan
        System.out.print("Masukkan bilangan kelipata (1 - 9) : ");
        kelipatan = scan.nextInt();

        //Perulangan WHILE dengan kondisi pemilihan IF
        int i = 1;  //inisialisasi

        while(i <= 50) {    //kondisi
            if(i % kelipatan == 0) {
                total += i;
                counter ++;
                rataRata = (float) total / counter;
            }
            i++;    //update
        }

        //Output banyak dan total bilangan kelipatan yang dimasukkan
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata - rata banyaknya kelipatan bilangan %d dari 1 sampai 50 adalah %f\n", kelipatan, rataRata);

    }
}
