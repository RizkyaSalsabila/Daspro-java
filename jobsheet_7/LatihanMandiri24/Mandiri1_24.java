import java.util.Scanner;

public class Mandiri1_24 {
    public static void main(String[] args) {

    //Deklarasi Scanner
    Scanner scan = new Scanner(System.in);

    //Buat variabel nama, jenisKelamin
    String nama;
    char jenisKelamin;
    int jumMahasiswa = 30;

    //Perulangan menggunakan for
    for (int urutan = 1; urutan <= jumMahasiswa; urutan++) {

        //Input nama mahasiswa dan jenis kelamin
        System.out.print("\nMasukkan nama mahasiswa ke - " + urutan + " : ");
        nama = scan.nextLine();
        System.out.print("Masukkan jenis kelamin(L/P) : ");
        jenisKelamin = scan.nextLine().charAt(0);

        //Perintah cetak jika jenis kelamin perempuan  
        if (jenisKelamin == 'p' || jenisKelamin == 'P') {
            System.out.println(nama + " merupakan mahasiswa berjenis kelamin perempuan");
        } 
    }
    scan.close();

    }
}