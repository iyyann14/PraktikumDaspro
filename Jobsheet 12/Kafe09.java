import java.util.Scanner;

public class Kafe09 {
    String[] daftarMenu = {"Kopi Hitam", "Cappucino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};

        public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
            System.out.println("Selamat Datang, " + namaPelanggan + "!");

            if (isMember) {
                System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setaip Pembelian!");
            }

            if (kodePromo != null && kodePromo.equals("DISKON50")) {
                System.out.println("Anda Mendapatkan Diskon 50%!");
            } else if (kodePromo != null && kodePromo.equals("DISKON30")) {
                System.out.println("Anda Mendapatkan Diskon 30%!");
            } else if (kodePromo == null || kodePromo.isEmpty()) {
                System.out.println("Tidak Ada Kode Promo");
            } else {
                System.out.println("Promo Tidak Valid");
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

    public static int hitungTotalBayar(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");

        System.out.print("\nMasukkan Nomor Menu yang Ingin Anda Pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Item yang Ingin Dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalBayar(pilihanMenu, banyakItem);

        System.out.println("\nTotal Harga Untuk Pesanan Anda: Rp" + totalHarga);
    }
}