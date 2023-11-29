public class Percobaan1_24 {
    //Buat fungsi faktorialRekursif()
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekursif(n - 1));
        }
    }

    //Buat fungsi faktorialInteraktif()
    static int faktorialInteraktif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
    
    //Buat fungsi main
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialInteraktif(5));
    }
}