public class programKu_24 {
    //Buat fungsi TampilHinggaKe()
    public static void TampilHinggaKe (int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
    }

    //Buat fungsi Jumlah()
    public static int Jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }

    //Buat fungsi TampilJumlah()
    public static void TampilJumlah (int bil1, int bil2) {
            TampilHinggaKe(Jumlah(bil1, bil2));
    }

    //Buat fungsi main
    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}