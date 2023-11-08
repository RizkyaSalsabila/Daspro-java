import java.util.Scanner;
public class Star24 {
    public static void main (String[] args) {
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        //Masukkan N
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        //Cetak * sebanyak N kali
        for (int i = 0; i <= N; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}