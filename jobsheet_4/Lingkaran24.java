import java.util.Scanner;
public class Lingkaran24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        //Buat Variabel r, keliling, luas, phi
        int r;
        double keliling, luas;
        double phi = 3.14;

        //Masukkan r
        System.out.print("Masukkan jari - jari lingkaran : ");
        r = input.nextInt();

        System.out.println("\n------------------------------------");

        //Hitung keliling lingkaran
        keliling = 2 * phi * r;    
        System.out.print("\nHasil Keliling Lingkaran : " + keliling);

        //Hitung luas lingkaran
        luas = phi * r * r;      
        System.out.print("\nHasil Luas Lingkaran : " + luas);  

    }
}