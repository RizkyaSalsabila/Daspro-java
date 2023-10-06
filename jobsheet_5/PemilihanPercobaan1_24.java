import java.util.Scanner;
public class PemilihanPercobaan1_24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Masukkan Angka
        System.out.print("Masukkan Angka : ");
        int angka = input24.nextInt();

        //Pemilihan menggunakan operand ternary
        String bilangan = angka % 2 == 0 ? "Bilangan Genap" : "Bilangan Ganjil";

        //Output Angka
        System.out.println("Angka " + angka + " adalah "+ bilangan);

    }
}