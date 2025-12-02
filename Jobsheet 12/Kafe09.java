import java.util.Scanner;

public class Kafe09 {
        public static void Menu(String namaPelanggan, boolean isMember) {
            System.out.println("Selamat Datang, " + namaPelanggan + "!");

            if (isMember) {
                System.out.println("Anda ADalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian");
            }

        System.out.println("==== MENU KAFE RESTO ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silahkan Pilih Menu yang Anda Inginkan.");
    }

    public static void main(String[] args) {
        Menu("Andi", true);
    }
}