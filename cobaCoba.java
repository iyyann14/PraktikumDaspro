import java.util.Scanner;

public class cobaCoba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diskon = 0, totalBayar;

        //input
        System.out.println("Masukkan Harga: ");
        double totalBelanja = sc.nextDouble();

        //if else
        if (totalBelanja >= 50000) {
            diskon = 0.1;
        } else if (totalBelanja >= 35000) {
            diskon = 0.05;
        } else {
            System.out.println("Tidak Mendapatkan Diskon");
        }

        //proses
        totalBayar = totalBelanja - (totalBelanja * diskon);

        //output
        System.out.println("Total Pembayaran: " + totalBayar); 
    }
}