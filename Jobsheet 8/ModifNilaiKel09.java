import java.util.Scanner;

public class ModifNilaiKel09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalNilai;
        double rataNilai;

        // Ganti WHILE dengan FOR
        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            System.out.println("Rata-rata: " + rataNilai);
            System.out.println("---");
        }

        sc.close();
    }
}