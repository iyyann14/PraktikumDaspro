import java.util.Scanner;

public class ArrayRataNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int jumlahLulus = 0;
        double total = 0;
        double rata2 = 0;
        double tdklulus = 0;

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
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        System.out.println("Rata - Rata Nilai Lulus : " + rata2);
        System.out.println("==========================");
        System.out.println("Rata - Rata Nilai Tidak Lulus : " + tdklulus);
        System.out.println("==========================");
        System.out.println("Jumlah Mahasiswa yang Lulus : " + jumlahLulus);
    }
}