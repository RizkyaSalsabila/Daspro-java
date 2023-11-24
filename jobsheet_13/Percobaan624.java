import java.util.Scanner;
public class Percobaan624 {
    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner input = new Scanner(System.in);
        
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);

        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);
    }
}