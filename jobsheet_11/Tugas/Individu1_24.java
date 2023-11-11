import java.util.Scanner;

public class Individu1_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;

        do {
            System.out.print("Masukkan N : ");
            N = input.nextInt();
            

            if (N < 3) {
                System.out.println("Nilai N minimal 3 !");
                System.out.println("Silahkan mengisikan ulang.\n");
            } else {
                break;
            }
        } while(true);

        int x = 1;
        for(int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(x);
                x++;
            }
            System.out.println();
            x = 1;
        } 
        input.close();    
    }
}