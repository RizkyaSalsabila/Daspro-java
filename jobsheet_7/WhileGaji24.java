import java.util.Scanner;

public class WhileGaji24 {
    public static void main (String[] args) {

        //Deklarasi Scanner
        Scanner scan = new Scanner(System.in);

        //Buat variabel
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        //Input jumlah karyawan
        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("\n\nPilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("\nMasukkan jabatan karyawan ke- " + (i+1) + " : ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur =  jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } 

            totalGajiLembur += gajiLembur;

        }
        System.out.println("Total gaji Lembur Anda : " + totalGajiLembur);
    }
}