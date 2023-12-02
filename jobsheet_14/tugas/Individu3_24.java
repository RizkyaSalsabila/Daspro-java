import java.util.Scanner;
public class Individu3_24 {
    //Buat fungsi pengecekan
    static boolean CekPrimaRekursif(int n, int pembagi) {
        if (n == pembagi) {
            pembagi = n - 1;
        }

        if (pembagi == 1) {
            return true;
        } else if(n % pembagi == 0) {
            return false;
        } else {
            return CekPrimaRekursif(n, pembagi - 1);
        }
    }
    
    //Buat fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cek bilangan : ");
        int n = sc.nextInt();

        boolean hasil = CekPrimaRekursif(n, n / 2);

        if (hasil) {
            System.out.print(n + " merupakan bilangan prima");
        } else {
            System.out.print(n + " bukan bilangan prima");
        }

        sc.close();
    }
}