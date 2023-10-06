import java.util.Scanner;
public class PemilihanPercobaan3_24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        // Buat variabel angka1, angka2, hasil, operator
        double angka1, angka2, hasil;
        char operator;

        //Masukkan Angka Pertama
        System.out.print("Masukkan Angka Pertama : ");
        angka1 = input24.nextDouble();
        //Masukkan Angka Kedua
        System.out.print("Masukkan Angka Kedua : ");
        angka2 = input24.nextDouble();
        //Masukkan Operator
        System.out.print("Masukkan Operator (+ - * /) : ");
        operator = input24.next().charAt(0);

        //Pemilihan atau percabangan menggunakan switch case
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default:
        }

    }
}