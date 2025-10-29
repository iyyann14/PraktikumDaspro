import java.util.Scanner;

public class ProgramParkir09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        System.out.print("Masukkan Jenis Kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi Parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                total += 12500;
                } else if (jenis == 1) {
                total += durasi * 3000;
                } else if (jenis == 2) {
                total += durasi * 2000;
                } 

                System.out.println("Biaya Parkir: Rp " + total);
                System.out.println();

            } else {
                System.out.println("Jenis Kendaraan Tidak Valid");
                System.out.println();
            }
            
            System.out.print("Masukkan Jenis Kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();
        } 
        
        System.out.println("Total Biaya Parkir: Rp.  " + total);
    }
}
