import java.util.Scanner;

public class NilaiKelompok09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalNilai;
        double rataNilai;
        int i = 1; 
        int j;     
        
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0; 
            for (j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                double nilai = sc.nextDouble(); 
                totalNilai += nilai; 
            }

            rataNilai = totalNilai / 5;

            System.out.println("Rata-rata: " + rataNilai);
            i++; 
            System.out.println("---"); 
        }
    }
}