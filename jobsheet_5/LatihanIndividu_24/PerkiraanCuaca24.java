package LatihanIndividu_24;

import java.util.Scanner;
public class PerkiraanCuaca24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Buat variabel cuaca
        String cuaca;

        System.out.println("-----Selamat Datang-----");
        System.out.println("Ini adalah Aplikasi Perkiraan Cuaca Sederhana");

        //Masukkan suhu
        System.out.print("\nMasukkan Suhu : ");
        double suhu = input24.nextDouble();

        //Pemilihan menggunakan if else
        if(suhu > 25) {
            cuaca = "Panas";
        } else {
            cuaca = "Mendung";
        }
        System.out.println("Suhu hari ini menunjukkan " + suhu + " celcius, maka diperkirakan hari ini cuacanya " + cuaca);
        input24.close();

    }
}