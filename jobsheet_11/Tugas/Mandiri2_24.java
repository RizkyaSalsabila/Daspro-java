import java.util.Scanner;
public class Mandiri2_24 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
