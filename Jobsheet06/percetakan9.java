package Jobsheet06;

import java.util.Scanner;

public class percetakan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Masukkan Jumlah Halaman Buku: ");
        int halaman = sc.nextInt();
        System.out.print("Masukkan Jenis Cover (hard/soft): ");
        String cover = sc.next();
        System.out.print("Masukkan Kota Tujuan Pengiriman: ");
        String kota = sc.next();

        // proses biaya cetak
        double biayaCetak = halaman * 200;

        double biayaCover = 0, beratCover = 0;

        // if else
        if (cover.equalsIgnoreCase("hard")) {
            biayaCover = 20000;
            beratCover = 250;

        } else if (cover.equalsIgnoreCase("soft")) {
            biayaCover = 10000;
            beratCover = 100;

        } else {
            System.out.println("Jenis Cover Tidak Valid"); 
            return;
        }

        // if else kota
        if (kota.equalsIgnoreCase("Malang") || kota.equalsIgnoreCase("Batu")) {
            int biayaKirim = 20000;
        } else {
            int beratKg = 0;
            double biayaKirim = beratKg * 15000;
        }

        // proses
        double beratKertas = halaman * 1.5;
        double beratTotal = beratKertas + beratCover + 300;
        double beratKg = Math.ceil(beratTotal / 1000);
        double biayaKirim = beratKg * 15000;
        double total = biayaCetak + biayaCover + biayaKirim;

        // output
        System.out.println("Total Biaya: " + total);
    }
}
