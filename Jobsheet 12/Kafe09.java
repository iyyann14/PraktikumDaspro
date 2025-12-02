import java.util.Scanner;

public class Kafe09 {
    String[] daftarMenu = { "Kopi Hitam", "Cappucino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng" };

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

    public static int hitungTotalBayar(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo != null && kodePromo.equals("DISKON50")) {
            System.out.println("Anda Mendapatkan Diskon 50%!");
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo != null && kodePromo.equals("DISKON30")) {
            System.out.println("Anda Mendapatkan Diskon 30%!");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else if (kodePromo == null || kodePromo.isEmpty()) {
            System.out.println("Tidak Ada Kode Promo");
        } else {
            System.out.println("Promo Tidak Valid");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Apakah Kamu Member? true/false: ");
        boolean isMember = sc.nextBoolean();

        String kodePromo = "DISKON30";

        Menu(namaPelanggan, isMember, kodePromo);

        int totalKeseluruhan = 0;

        System.out.print("\nBerapa Jenis Menu yang Ingin Dipesan? ");
        int jumlahJenis = sc.nextInt();

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);

            System.out.print("Pilih Nomor Menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Jumlah Item: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalBayar(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
        }
        System.out.println("\n---------------------------------------------");
        System.out.println("\nTotal Seluruh Pesanan Anda: Rp" + totalKeseluruhan);
        System.out.println("\n------------------------------------------------");
    }
}