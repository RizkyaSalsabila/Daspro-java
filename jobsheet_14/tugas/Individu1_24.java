import java.util.Scanner;
public class Individu1_24 {
    //Fungsi rekursif
    static void DeretDescendingRekursif(int n) {
       if (n >= 0) {
        System.out.print(n + " ");
        DeretDescendingRekursif(n - 1);
       }
    }

    //Fungsi iteratif
    static void DeretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    //Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = sc.nextInt();
        System.out.println();

        System.out.print("Deret bilangan " + bil + " dengan fungsi rekursif : ");
        DeretDescendingRekursif(bil);
        System.out.println();

        System.out.print("Deret bilangan " + bil + " dengan fungsi iteratif : ");
        DeretDescendingIteratif(bil);

        sc.close();
    }
}