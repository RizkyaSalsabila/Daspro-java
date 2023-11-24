import java.util.Scanner;
public class Kubus24 {
    static int hitungVolKubus (int s) {
        int volKubus = s * s * s;
        return volKubus;
    }

    static int hitungLpKubus (int s) {
        int lpKubus = 6 * s * s;
        return lpKubus;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan sisi kubus : ");
        int sisi = input.nextInt();
        System.out.println("Volume kubus adalah " + hitungVolKubus(sisi));
        System.out.println("Luas permukaan kubus adalah " + hitungLpKubus(sisi));

    }
}