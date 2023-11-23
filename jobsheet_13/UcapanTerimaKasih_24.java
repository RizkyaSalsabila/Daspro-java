import java.util.Scanner;
public class UcapanTerimaKasih_24 {
    public static String PenerimaUcapan() {
        //Deklarasikan scanner
        Scanner sc = new Scanner(System.in);

        //Input namaOrang
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    //Buat fungsi UcapanTerimaKasih()
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    //Fungsi main
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}