import java.util.Scanner;
public class SeacrhNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Nilai yang akan Diinput: ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int[jumlah];
        for (int i = 0; i <arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println();

        if (hasil != -1) {
            System.out.println("Nilai" + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        System.out.println();
    }
}