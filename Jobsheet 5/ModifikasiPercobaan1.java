import java.util.Scanner;

public class ModifikasiPercobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.println("Apakah UKT sudah lunas? (true/fales): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tanga DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
    }
}