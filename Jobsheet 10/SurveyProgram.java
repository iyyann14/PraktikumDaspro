import java.util.Scanner;

public class SurveyProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[2][3];
        double[] avgResponden = new double[2];
        double[] avgPertanyaan = new double[3];

        double totalKeseluruhan = 0;
        int jumlahData = 2 * 3;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan Nilai Responden " + (i + 1) +
                        " Untuk Pernyataan " + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += survey[i][j];
            }
            avgResponden[i] = sum / 3;
        }

        for (int j = 0; j < 2; j++) {
            double sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += survey[i][j];
            }
            avgPertanyaan[j] = sum / 2;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }

        double avgKeseluruhan = totalKeseluruhan / jumlahData;

        System.out.println("\n=== Rata-rata Setiap Responden ===");
        for (int i = 0; i < 2; i++) {
            System.out.println("Responden " + (i + 1) + ": " + avgResponden[i]);
        }

        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < 3; j++) {
            System.out.println("Pertanyaan " + (j + 1) + ": " + avgPertanyaan[j]);
        }

        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println(avgKeseluruhan);
    }
}