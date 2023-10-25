import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        int n;      //Buat variable n
        System.out.print("Masukkan jumlah mahasiswa : ");     //Input banyaknya jumlah mahasiswa
        n = sc.nextInt();
        
        //Deklarasi array nilaiMhs bertipe int
        int[] nilaiMhs = new int[n];
        //Deklarasi variable totLulus, totTidakLulus, rata2Lulus, rata2TidakLulus, jumLulus, jumTidakLulus
        double totLulus = 0;
        double totTidakLulus = 0;
        double rata2Lulus;
        double rata2TidakLulus;
        int jumLulus = 0;
        int jumTidakLulus = 0;

        //Perulangan FOR untuk menerima input dan mengisi elemen array nilaiMhs
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.println("\n--------------------------------------\n");

        //Perulangan FOR untuk menentukan jumlah mahasiswa yang lulus dan tidak lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {     //jika lulus
                System.out.println("Mahasiswa ke - " + (i+1) + " dinyatakan lulus!");
                jumLulus++;
                totLulus += nilaiMhs[i];
            } else {                    //jika tidak lulus
                System.out.println("Mahasiswa ke - " + (i+1) + " dinyatakan tidak lulus!");
                jumTidakLulus++;
                totTidakLulus += nilaiMhs[i];
            }
        }

        rata2Lulus = totLulus / jumLulus;                   //rumus nilai rata2 lulus
        //cetak rata2 lulus
        System.out.println("\nRata - rata nilai mahasiswa yang lulus : " + rata2Lulus);  
        //cetak jumlah mahasiswa keseluruhan yang lulus   
        System.out.println("Banyaknya mahasiswa yang lulus " + jumLulus + " orang");

        rata2TidakLulus = totTidakLulus / jumTidakLulus;    //rumus nilai rata2 tidak lulus
        //cetak rata2 tidak lulus
        System.out.println("\nRata - rata nilai mahasiswa yang tidak lulus : " + rata2TidakLulus);
        //cetak jumlah mahasiswa keseluruhan yang lulus   
        System.out.println("Banyaknya mahasiswa yang tidak lulus " + jumTidakLulus + " orang");

    }
}