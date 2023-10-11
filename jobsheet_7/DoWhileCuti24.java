import java.util.Scanner;

public class DoWhileCuti24 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner scan = new Scanner(System.in);

        //Buat variabel
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = scan.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t) ?");
            konfirmasi = scan.next();

            if(konfirmasi.equalsIgnoreCase(" y")) {
                System.out.print("Jumlah Hari : ");
                jumlahHari = scan.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);




    }
}
