import java.util.Scanner;

public class ArrayRataNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahLulus = 0;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        double total = 0;
        double rata2 = 0;
        double tdklulus = 0;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jml = sc.nextInt();

        int[] nilaiMhs = new int[jml];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }


        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                rata2 = total / nilaiMhs.length;
            } else {
                tdklulus = total / nilaiMhs.length;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        System.out.println("Rata - Rata Nilai Lulus : " + rata2);
        System.out.println("==========================");
        System.out.println("Rata - Rata Nilai Tidak Lulus : " + tdklulus);
        System.out.println("==========================");
        System.out.println("Jumlah Mahasiswa yang Lulus : " + jumlahLulus);
        System.out.println("==========================");
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("==========================");
        System.out.println("Nilai Terendah : " + nilaiTerendah);
    }
}