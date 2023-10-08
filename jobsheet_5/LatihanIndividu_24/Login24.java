import java.util.Scanner;
public class Login24 {
    public static void main (String[] args) {
        //Deklarasi Scanner
        Scanner username24 = new Scanner(System.in);

        //Buat variabel inputUser, inputPassword
        String inputUser, inputPassword;

        System.out.println("--- LOGIN ---");
        System.out.println("Selamat Datang di Aplikasi Sederhana");

        //Masukkan username
        System.out.print("\nMasukkan Username : ");
        inputUser = username24.nextLine();

        //Masukkan password
        System.out.print("Masukkan Password : ");
        inputPassword = username24.nextLine();

        if (inputUser.equals("Pengguna") && inputPassword.equals("123")) {
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Username atau Password Anda salah! Silahkan coba lagi");
        }

        username24.close();
    }
}