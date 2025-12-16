import java.util.Scanner;

public class CMBeasiswa09 {
    static Scanner sc = new Scanner(System.in);

    static String[][] data = new String[100][5];
    static int jumlahData = 0;

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU UTAMA SISTEM PENDAFTARAN MAGANG =====");
            System.out.println("1. Tambah Data Pendaftar");
            System.out.println("2. Tampilkan Semua Data Pendaftar");
            System.out.println("3. Cari Data Berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata Rata IPK per Jenis Beasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariJenis();
                    break;
                case 4:
                    hitungRata();
                    break;
                case 5:
                    System.out.println("Terima Kasih! Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("IPK Terakhir: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        String jenis;
        while (true) {
            System.out.print("Jenis Beasiswa (Regular/Unggulan/Riset): ");
            jenis = sc.nextLine();

            if (jenis.equalsIgnoreCase("Regular") ||
                    jenis.equalsIgnoreCase("Unggulan") ||
                    jenis.equalsIgnoreCase("Riset"))
                break;

            System.out.println("Jenis Beasiswa Tidak Valid!");
        }

        System.out.print("Penghasilan Orang Tua (maksimal 2000000): ");
        long penghasilan = sc.nextLong();
        sc.nextLine();

        if (penghasilan > 2000000) {
            System.out.println("Pendaftaran dibatalkan Karena Penghasilan Melebihi Batas Maksimal");
            return;
        }

        data[jumlahData][0] = nama;
        data[jumlahData][1] = nim;
        data[jumlahData][2] = String.valueOf(ipk);
        data[jumlahData][3] = jenis;
        data[jumlahData][4] = String.valueOf(penghasilan);

        jumlahData++;

        System.out.println("Pendaftar Berhasil Disimpan. Total Pendaftar: " + jumlahData);
    }

    static void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Belum Ada Pendaftar");
            return;
        }

        System.out.println("\nNo    Nama                NIM         IPK         Jenis           Penghasilan");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-4d%-20s%-12s%-8s%-14s%-10s\n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    data[i][3],
                    data[i][4]);
        }

        System.out.println("----------------------------------------------------------------------------------");
    }

    static void cariJenis() {
        System.out.print("Masukkan Jenis Beasiswa: ");
        String key = sc.nextLine();

        boolean ada = false;

        System.out.println();

        for (int i = 0; i < jumlahData; i++) {
            if (data[i][3].equalsIgnoreCase(key))

                if (!ada) {
                    System.out.println("No  Nama                NIM         IPK     Jenis               Penghasilan");
                    System.out.println(
                            "-----------------------------------------------------------------------------------");
                }

            System.out.printf("%-4d%-20s%-12s%-8s%-14s%-10s\n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    data[i][3],
                    data[i][4]);

            ada = true;
        }

        if (!ada) {
            System.out.println("Tidak Ada Pendaftar.");
        } else {
            System.out.println(
                    "----------------------------------------------------------------------------------------------");
        }
    }

    static void hitungRata() {
        double Reg = 0, Ung = 0, Ris = 0;
        int cReg = 0, cUng = 0, cRis = 0;

        for (int i = 0; i < jumlahData; i++) {
            double ipk = Double.valueOf(data[i][2]);
            String jenis = data[i][3].toLowerCase();

            if (jenis.equals("reguler")) {
                Reg += ipk;
                cReg++;
            } else if (jenis.equals("unggulan")) {
                Ung += ipk;
                cUng++;
            } else if (jenis.equals("riset")) {
                Ris += ipk;
                cRis++;
            }
        }

        System.out.println("Reguler : "
                + (cReg == 0 ? "Tidak Ada Pendaftar." : "Rata-Rata IPK = " + String.format("%.2f", (Reg / cReg))));
        System.out.println("Unggulan : "
                + (cUng == 0 ? "Tidak Ada Pendaftar." : "Rata-Rata IPK = " + String.format("%.2f", (Ung / cUng))));
        System.out.println("Riset : "
                + (cRis == 0 ? "Tidak Ada Pendaftar." : "Rata-Rata IPK = " + String.format("%.2f", (Ris / cRis))));
    }
}