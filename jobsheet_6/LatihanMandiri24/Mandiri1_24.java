import java.util.Scanner;

public class Mandiri1_24 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner input24 = new Scanner (System.in);

        //Buat Variabel
        int bil1, bil2, bil3;
        String bil = "Bilangan Terbesar";
        
        //Input 
        System.out.print("Masukkan Bilangan 1 : ");
        bil1 = input24.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        bil2 = input24.nextInt();
        System.out.print("Masukkan Bilangan 3 : ");
        bil3 = input24.nextInt();

        if(bil1 > bil2) {
            if(bil1 > bil3) {
                System.out.println(bil + " Adalah " + bil1);
            } else {
                System.out.println(bil + " Adalah " + bil3);
            }
        } else if(bil2 > bil3) {
            if(bil2 > bil1) {
            System.out.println(bil + " Adalah " + bil2);
            } else {
                System.out.println(bil + " Adalah " + bil3);
            }
        } else {
            System.out.println("Tidak ada bilangan terbesar");
        }
        input24.close();

    }
}
