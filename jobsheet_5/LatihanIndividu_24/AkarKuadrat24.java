import java.util.Scanner;
public class AkarKuadrat24 {
    public static void main(String args[]) {

        int a, b, c;
        double D, x1, x2;

        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        System.out.print("Masukkan nilai a : ");
        a = input24.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = input24.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = input24.nextInt();

        D = b*b - 4*a*c;

        if(a == 0) {
            x1 = (-c) / b;
            System.out.println("Nilai x1 yang memenuhi : " + x1);
        } else {
            if(D < 0) {
                System.out.println("Akar persamaan kuadrat adalah bilangan imajiner");
            } else {
                //x1 = (-b + Math.sqrt(D)) / (2 * a);
                x1 = (-b/2*a) + (Math.sqrt(D) / 2*a);
                x2 = (-b/2*a) - (Math.sqrt(D) / 2*a);
                System.out.println("Nilai x1 yang memenuhi : " + x1);
                System.out.println("Nilai x2 yang memenuhi : " + x2);
            }
        }
        input24. close();
    }
}