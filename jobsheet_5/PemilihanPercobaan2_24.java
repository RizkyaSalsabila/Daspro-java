import java.util.Scanner;
public class PemilihanPercobaan2_24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Buat Variabel grade
        String grade;

        //Masukkan nilai uas
        System.out.print("Nilai UAS : ");
        float uas = input24.nextFloat();
        //Masukkan nilai uts
        System.out.print("Nilai UTS : ");
        float uts = input24.nextFloat();
        //Masukkan nilai kuis
        System.out.print("Nilai Kuis : ");
        float kuis = input24.nextFloat();
        //Masukkan nilai tugas
        System.out.print("Nilai Tugas : ");
        float tugas = input24.nextFloat();

        //Rumus total
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        //Pemilihan menggunakan if else
        if (total > 80 && total <= 100) {
            grade = "A";
        } else if (total > 73 && total <=80) {
            grade = "B+";
        } else if (total > 65 && total <= 73) {
            grade = "B";
        } else if (total > 60 && total <= 65) {
            grade = "C+";
        } else if (total > 50 && total <= 60) {
            grade = "C";
        } else if (total > 39 && total <= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        //Penentuan hasil
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        //Output nilai akhir
        System.out.println("Nilai Akhir =  " + total + " dengan grade " + grade + " sehingga " + message);
    }
}