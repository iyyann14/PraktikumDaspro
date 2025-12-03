import java.util.Scanner;

public class Kubus09 {
    static int sisi;

    static int hitungLuas() {
        int luas = 6 * sisi * sisi;
        return luas;
    }

    static int hitungVolume() {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L, vol;
        System.out.print("Masukkana Panjang Sisi: ");
        sisi = sc.nextInt();

        L = hitungLuas();
        System.out.println("Luas Permukaan Kubus Adalah " + L + "cm2");

        vol = hitungVolume();
        System.out.println("Volume Kubus Adalah " + vol + "cm3");
    }
}