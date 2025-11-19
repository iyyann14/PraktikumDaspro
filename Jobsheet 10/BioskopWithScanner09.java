import java.util.Scanner;
public class BioskopWithScanner09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[10][9];
        while (true) {
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan Kolom: ");
            int kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input Penonton Lainnya? (y/n): ");
            String next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}