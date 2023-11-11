import java.util.Scanner;
public class Individu2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;

        do {
            System.out.print("Masukkan N (minimal 5) : ");
            N = input.nextInt();

            if (N < 5) {
                System.out.println("Nilai N minimal 5 !");
                System.out.println("Silahkan mengisi ulang.\n");
            } else {
                break;
            }
        } while(true);

        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        input.close();
    }
}