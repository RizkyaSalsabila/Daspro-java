public class Mandiri3_24 {
    public static void main(String[] args) {

        //Print perintah deret bilangan kecuali keliapatan 3
        System.out.println("Menampilkan deret bilangan 1 sampai 50 kecuali kelipatan 3");

        //Perulangan While
        int bil = 1;
        while (bil <= 50) {
            if (bil % 3 != 0) {     //Jika kelipatan 3 tidak akan di cetak
                System.out.print (bil+ " ");
            }
            bil++;
        }

    }
}