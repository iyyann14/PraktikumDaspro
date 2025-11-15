import java.util.Scanner;

public class ProgramNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", 
                                "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga= {20000, 22000, 15000, 17000, 13000, 18000, 20000};

        System.out.print("Masukkan Jumlah Pesanan (Ketik 0 Untuk Keluar) : ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        if (jumlahPesanan == 0) {
            System.out.println("Tidak Ada Pesanan");
            return;
        }

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] jumlahItem = new int[jumlahPesanan];

        int totalHarga = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan Menu ke-" + (i + 1) + ": ");
            String namaMenu = sc.nextLine();

            int indexMenu = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (namaMenu.equalsIgnoreCase(daftarMenu[j])) {
                    indexMenu = j;
                    break;
                }
            }

            if (indexMenu == -1) {
             System.out.println("Maaf, Menu Tidak Tersedia");
             i--;
             continue;   
            }

            System.out.print("Masukkan Jumlah: ");
            int jml = sc.nextInt();
            sc.nextLine();

            daftarPesanan[i] = daftarMenu[indexMenu];
            jumlahItem[i] = jml;

            totalHarga += daftarHarga[indexMenu] * jml;
        }
        System.out.println("Total: " + totalHarga);
    }
}