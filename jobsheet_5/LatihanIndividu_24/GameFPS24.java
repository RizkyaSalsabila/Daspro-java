package LatihanIndividu_24;

import java.util.Scanner;
public class GameFPS24 {
    public static void main (String[] args) {
        
        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Masukkan Jarak
        System.out.print("Masukkan Jarak : ");
        double jarak = input24.nextDouble();

        //Pemilihan menggunakan if else
        if (jarak <= 5) {
            System.out.println("Gunakan pertarungan menggunakan jarak Melee Weapon");
        } else {
            System.out.println("Gunakan pertarungan menggunakan jarak Ranged Weapon");
        }

        input24.close();
    }
}