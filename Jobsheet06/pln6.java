package Jobsheet06;
import java.util.Scanner;

public class pln6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

            //deklarasi
        int biaya, tarif = 0, kWh, va9, va22, va55;
        double ppn, totalBiaya;
        String dayaListrik;

        //diketahui
        biaya = 50000;
        va9 = 1300;
        va22 = 1500;
        va55 = 3500;
        ppn = 0.1;

        //input
        System.out.println("Kita Memiliki 3 Jenis Daya = 900VA, 2.200VA, 5.500VA");
        System.out.print("Masukkan Daya Listrik: ");
        dayaListrik = sc.next();
        System.out.print("Masukkan Total kWh yang Ingin Digunakan: ");
        kWh = sc.nextInt();

        //switch case
        switch (dayaListrik) {
            case "900":
                tarif = va9 * kWh;
                break;
            case "2200":
                tarif = va22 * kWh;
                break;
            case "5500":
                tarif = va55 * kWh;
                break;
            default:
                System.out.println("Daya listrik tidak valid.");
                return;
        }


        //proses
        biaya = biaya + tarif;
        totalBiaya = biaya * ppn;

        //output
        System.out.println("Total Biaya: " + totalBiaya);
}    
}
