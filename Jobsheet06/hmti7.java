package Jobsheet06;

import java.util.Scanner;

public class hmti7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah tim
        System.out.print("Masukkan Jumlah Tim: ");
        int jumlahTim = sc.nextInt();

        // input keterangan
        System.out.print("Apakah Polinema memberikan dana bantuan? (ya/tidak): ");
        String bantuan = sc.next();

        double persenPolinema = 0;

        // input
        if (bantuan.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan Persentase Bantuan (1-100): ");
            int pilihan = sc.nextInt();

            // switch case
            switch (pilihan) {
                case 60:
                    persenPolinema = 60;
                case 70:
                    persenPolinema = 70;
                case 80:
                    persenPolinema = 80;
                default:
                    if (pilihan >= 1 && pilihan <= 99) {
                        persenPolinema = pilihan;
                        //Biaya tetap
                        double publikasi = 300000;
                        double dekorasi = 500000;
                        double konsumsiPanitia = 500000;
                        double hadiah = 4000000;
                        double operasional = 500000;

                        //Biaya jumlah tim
                        int jumlahPeserta = jumlahTim * 3;
                        double konsumsiPeserta = 25000 * jumlahPeserta;
                        double honorJuri = 75000 * jumlahTim;

                        //Total anggaran
                        double total = publikasi + dekorasi + konsumsiPanitia + hadiah + operasional
                                + konsumsiPeserta + honorJuri;

                        //Hitung sumber dana
                        double danaPolinema = total * (persenPolinema / 100);
                        double pendaftaran = 50000 * jumlahTim;
                        double sponsor = total - (danaPolinema + pendaftaran);

                        // output
                        System.out.println("Biaya Sponsor: " + sponsor);
                    } else {
                        System.out.println("Tidak Perlu Memberikan Bantuan");
                        persenPolinema = 0;
                    }
            }
        } else {
            persenPolinema = 0;
        }
    }
}