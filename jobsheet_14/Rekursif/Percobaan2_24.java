import java.util.Scanner;
public class Percobaan2_24 {

    //Buat fungsi hitungPangkat()
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
          } else {
            System.out.print(x + " x ");
            if (y == 1) {
                System.out.print("1 = ");
            }
            return (x * hitungPangkat(x, y - 1));
        }
    }

    //Buat fungsi method main()
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        //Buat 2 variabel bertipe int
        int bilangan, pangkat;

        //Input bilangan
        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        //Input pangkat
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();

        //Cetak hasil
        System.out.println(hitungPangkat(bilangan, pangkat));

        sc.close();
    }
}