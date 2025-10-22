package Jobsheet06;
import java.util.Scanner;

public class rentalMobil1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int sewaMobil, sewaSupir, lamaSewa, jarak, totalBiaya, bbm = 0, totalBBM;
        String bahanBakar;

        //diketahui
        sewaMobil = 300000;
        sewaSupir = 200000;
        int pertalite = 1000;
        int pertamax = 1300;

        //input
        System.out.print("Masukkan Jarak Tempuh: ");
        jarak = sc.nextInt();
        System.out.print("Masukkan Lama Sewa: ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan Jenis BBM (Pertalite/Pertamax): ");
        bahanBakar = sc.next();

        //bahanbakar
        if (bahanBakar.equalsIgnoreCase("pertalite")) {
            bbm = pertalite * jarak;
        } else if (bahanBakar.equalsIgnoreCase("pertamax")) {
            bbm = pertamax * jarak;
        } else {
            System.out.println("Tipe Bahan Bakarmu Tidak Tersedia");
        }

        sewaMobil = (sewaMobil + sewaSupir) * lamaSewa;
        totalBBM = bbm;
        totalBiaya = sewaMobil + totalBBM;
        
        //output
        System.out.println("Total Biaya: " + totalBiaya);
    }
}
