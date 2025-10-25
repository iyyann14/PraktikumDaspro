package Jobsheet06;

import java.util.Scanner;

public class percetakan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Masukkan Jumlah Halaman Buku: ");
        int halaman = sc.nextInt();
        System.out.print("Masukkan Jenis Cover (hard/soft): ");
        String cover = sc.next();

        // proses biaya cetak
        double biayaCetak = halaman * 200;

        double biayaCover = 0, beratCover = 0;

        // if else
        if (cover.equalsIgnoreCase("hard")) {
            biayaCover = 20000;
            beratCover = 250;
            // proses
            double beratKertas = halaman * 1.5;
            double beratTotal = beratKertas + beratCover + 300;
            double beratKg = Math.ceil(beratTotal / 1000);
            double biayaKirim = beratKg * 15000;
            double total = biayaCetak + biayaCover + biayaKirim;

            // output
            System.out.println("Total Biaya: " + total);


        } else if (cover.equalsIgnoreCase("soft")) {
            biayaCover = 10000;
            beratCover = 100;
            // proses
            double beratKertas = halaman * 1.5;
            double beratTotal = beratKertas + beratCover + 300;
            double beratKg = Math.ceil(beratTotal / 1000);
            double biayaKirim = beratKg * 15000;
            double total = biayaCetak + biayaCover + biayaKirim;

            // output
            System.out.println("Total Biaya: " + total);


        } else {
            System.out.println("Jenis Cover Tidak Valid");
        }
    }
}