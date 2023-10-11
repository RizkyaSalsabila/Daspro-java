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
            System.out.println("\nPilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke- " + (i+1) + " : ");
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
            } else {
                System.out.println("Jabatan invalid");
                i--;
                continue;
            }
            totalGajiLembur += gajiLembur;
        }
        
        //Output Total Gaji Lembur
        System.out.println("Total Gaji Lembur : " + totalGajiLembur);
    }
}