import java.util.Scanner;

public class ForKelipatan24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner scan = new Scanner(System.in);

        //Buat variabel 
        int kelipatan, total = 0, counter = 0;

        //Input bilangan kelipatan
        System.out.print("Masukkan bilangan kelipatan (1 - 9) : ");
        kelipatan = scan.nextInt();

        //Perulangan FOR dengan kondisi pemilihan IF
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
        
        //Output banyak dan total bilangan kelipatan yang dimasukkan
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}