import java.util.Scanner;

public class LatihanIndividu2_24 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input24 = new Scanner(System.in);

        //Instansiasi array dengan jumlah elemen 10
        int array[] = new int[10];
        
        System.out.println("Masukkan 10 angka ke dalam array : ");
        //Array loop untuk input angka sebanyak 10
        for (int i = 0; i < array.length; i++) {
            System.out.print("Angka ke - " + (i+1) + " : ");
            array[i] = input24.nextInt();
        }
    
        System.out.println("\nHasil tampilan array secara terbalik : ");
        //Array loop untuk menampilkan array secara terbalik
        for (int i = 9; i >= 0; i--) {
            System.out.println("Angka ke - " + (i+1) + " : " + array[i]);
        }
        input24.close();

    }
}