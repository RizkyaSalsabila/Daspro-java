public class Mandiri2_24 {
    public static void main(String[] args) {

        //Buat variabel jumlah
        int jumlah = 0;

        System.out.println("Hasil penjumlahan deret bilangan 25 sampai dengan 1\n");
        
        //Perulangan menggunakan for
        for (int bil = 25; bil >= 1; bil--) {
            if (bil != 1) {     //Tambah tanda (+) jika bil bukan angka 1
                System.out.print(bil + " + ");
            } else {            //Tambah tanda (=) jika bil merupakan angka 1
                System.out.print(bil + " = ");
            }
            jumlah += bil;      //Total untuk menghitung jumlah deret bilangan keseluruhan
        }
        System.out.print(jumlah);   //Cetak total jumlah deret bilangan keseluruhan

    }
}