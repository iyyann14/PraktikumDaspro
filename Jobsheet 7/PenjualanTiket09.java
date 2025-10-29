import java.util.Scanner;

public class PenjualanTiket09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 50000, totalTiket = 0, jumlah;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan Jumlah Tiket Terjual (0 untuk berhenti): ");
            jumlah = sc.nextInt();
            if (jumlah == 0) {
                break;
            }
            if (jumlah < 0) {
                System.out.println("Jumlah Tiket Tidak Valid. Masukkan Lagi Jumlah Tiket yang Valid!");
                continue;
            }

            double totalHarga = harga * jumlah;
            double diskon = 0;

            if (jumlah > 10) {
                diskon = totalHarga * 0.15;
            } else if (jumlah > 4) {
                diskon = totalHarga * 0.10;
            }

            double totalBayar = totalHarga - diskon;
            System.out.println("Total harga untuk " + jumlah + " tiket: Rp" + (int) totalHarga);
            System.out.println("Total diskon untuk " + jumlah + " tiket: Rp " + (int) diskon);
            System.out.println("Total bayar untuk " + jumlah + " tiket: Rp " + (int) totalBayar);
            System.out.println();

            totalTiket += jumlah;
            totalPenjualan += totalBayar;
        }

        System.out.println("Total tiket terjual hari ini : " + totalTiket);
        System.out.printf("Total penjualan hari ini     : Rp " + (int) totalPenjualan);
    }
}