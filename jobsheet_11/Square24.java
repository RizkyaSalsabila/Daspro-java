import java.util.Scanner;

public class Square24 {
    public static void main (String[] args) {
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Masukkan N
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        //Cetak * sebanyak N kali
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}