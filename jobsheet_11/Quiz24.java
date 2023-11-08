import java.util.Scanner;
import java.util.Random;

public class Quiz24 {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
        
                if(answer == number) {
                    success = true;
                    System.out.println("Jawaban benar");
                } else if(answer > number) {
                    System.out.println("Input yang Anda masukkan lebih besar dari jawaban / number");
                } else {
                    System.out.println("Input yang Anda masukkan lebih kecil dari jawaban / number");
                }
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)? ");
            menu = input.nextLine().charAt(0);
        } while(menu == 'y'|| menu == 'Y');

        input.close();
    }
}