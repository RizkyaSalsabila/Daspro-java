public class Percobaan524 {
    //Buat fungsi Tampil()
    static void Tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen / parameter: " + a.length);

        //Perulangan untuk mencetak setiap parameter
        for(int i : a) {
            System.out.print(i + " ");
        }
        //Untuk mencetak baris baru
        System.out.println();
    }

    //Buat fungsi main
    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);                    //Ada 2 parameter
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);       //Ada 5 parameter
        Tampil("Polinema");                                 //Tidak ada parameter
    }
}