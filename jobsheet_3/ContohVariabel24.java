public class ContohVariabel24 {
    public static void main(String[] args) {
        
        String Hobi = "Mendengarkan musik, membaca, fotografi";
        boolean Pandai = true;
        char jenisKelamin = 'P';
        byte umur = 19;
        double ipk = 3.24, tinggi = 1.60;

        System.out.println(Hobi);
        System.out.println("Apakah pandai ?" + Pandai);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umurku saat ini : " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));

    }
}