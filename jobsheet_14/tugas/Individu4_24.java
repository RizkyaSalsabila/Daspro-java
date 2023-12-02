import java.util.Scanner;
public class Individu4_24 {
    //Buat fungsi tambahan
    static int fibonacciMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else if (bulan < 1) {
            return 0;
        }else {
            return fibonacciMarmut(bulan - 2) + fibonacciMarmut(bulan - 1);
        }
    }

    //Buat fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan : ");
        int bulan = sc.nextInt();
        System.out.println();

        System.out.println("Bulan Ke -\tPasangan Produktif\tPasangan Belum Produktift\tTotal Pasangan");

        for (int i = 1; i <= bulan; i++) {
            int totPas = fibonacciMarmut(i);
            int jumPas = fibonacciMarmut(i - 1);
            int blmProduktif = fibonacciMarmut(i - 2);

            System.out.println(i + "\t\t\t" +  blmProduktif + "\t\t\t" + jumPas + "\t\t\t\t" + totPas);
        }

        sc.close();
    }
}