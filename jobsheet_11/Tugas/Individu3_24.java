import java.util.Scanner;
public class Individu3_24 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;

        do {
            System.out.print("Masukkan N (minimal 3) : ");
            N = input.nextInt();

            if (N < 3) {
                System.out.println("Nilai N minimal 3 !");
                System.out.println("Silahkan mengisi ulang.\n"); 
            } else {
                break;
            }
        } while(true);

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j < N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(N);
        }

        input.close();
    }
}