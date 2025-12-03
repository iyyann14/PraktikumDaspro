import java.util.Scanner;

public class HitungBalok09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan Panjang: ");
        p = sc.nextInt();

        System.out.print("Masukkan Lebar: ");
        l = sc.nextInt();

        System.out.print("Masukkan Tinggi: ");
        t = sc.nextInt();

        L = p * l;
        System.out.println("Luas Persegi Panjang Adalah " + L + "cm2");
        vol = p * l * t;
        System.out.println("Volume Balok Adalah " + vol + "cm3");

        sc.close();
    }
}