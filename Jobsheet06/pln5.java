package Jobsheet06;
import java.util.Scanner;

public class pln5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int biaya, tarif = 0, va9, va22, va55, kWh;
        double ppn, totalBiaya;
        int dayaListrik;

        //diketahui
        biaya = 50000;
        va9 = 1300;
        va22 = 1500;
        va55 = 3500;
        ppn = 0.1;

        //input
        System.out.println("Kita Memiliki 3 Jenis Daya = 900VA, 2.200VA, 5.500VA");
        System.out.print("Masukkan Angka Daya Listrik: ");
        dayaListrik = sc.nextInt();
        System.out.print("Masukkan Total kWh yang Ingin Digunakan: ");
        kWh = sc.nextInt();

        //if else
        if (dayaListrik == 900) {
            tarif = va9 * kWh;
        } else if (dayaListrik == 2200) {
            tarif = va22 * kWh;
        } else if (dayaListrik == 5500) {
            tarif = va55 * kWh; 
        } 


        //proses
        biaya = biaya + tarif;
        totalBiaya = biaya * ppn;

        //output
        System.out.println("Total Biaya: " + totalBiaya);
    }
    }
