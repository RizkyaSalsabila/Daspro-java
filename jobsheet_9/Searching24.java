public class Searching24 {
    public static void main(String[] args) {
        
        //Inisialisasi array berupa integer
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        //Buat variabel key, hasil
        int key = 20;
        int hasil = 0;

        //Array Loop sesuai panjang arrayInt
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        //Cetak posisi key dalam array
        System.out.println("Key ada dalam array pada posisi indeks ke- " + hasil);
    }
}