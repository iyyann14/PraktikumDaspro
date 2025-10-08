import java.util.Scanner;

public class PemilihanHariDenganIf09{ 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int dayNumber;
        String dayType;

        //input
        System.out.print("Masukkan angka hari (1-7): ");
        dayNumber = sc.nextInt();

        //proses
        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "weekdays";
        } else if (dayNumber >= 6 && dayNumber <= 7) {
            dayType = "weekend";
        } else {
            dayType = "Invalid Number";
        }
        System.out.println("Hari ini adalah " + dayType);
    }
}