public class TerimaKasih_24 {
    //Buat fungsi UcapanTerimaKasih
    public static void UcapanTerimaKasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    //Buat fungsi dengan parameter bertipe String, namaParameter ucapan
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    //Buat fungsi main
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}