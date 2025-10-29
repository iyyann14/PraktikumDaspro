import java.util.Scanner;

public class ModifSiakadFor09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, lulus = 0, tidakLulus = 0, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke -" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai Tertinggi :" + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("--------------------");
        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);
    }
}