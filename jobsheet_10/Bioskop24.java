public class Bioskop24 {
    public static void main(String[] args) {
        //Deklarasi dan instansiasi array 2 dimensi penonton
        String[][] penonton = new String[4][2];

        //Isi elemen array penonton
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        //Cetak semua elemen
        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        //Cetak panjang elemen array penonton
        System.out.println(penonton.length);
        //Array loop for untuk menampilkan panjang setiap baris
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke - " + (i+1) + " : " + penonton[i].length);
        }
    }
}