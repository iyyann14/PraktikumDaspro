import java.util.Scanner;

public class MaxMin09 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int A, B, C;
        int max, min;

        // input
        System.out.print("Masukkan bilangan A: ");
        A = sc.nextInt();
        System.out.print("Masukkan bilangan B: ");
        B = sc.nextInt();
        System.out.print("Masukkan bilangan C: ");
        C = sc.nextInt();

        // Menentukan bilangan maksimum
        if (A > B) {
            if (A > C) {
                max = A;
            } else {
                max = C;
            }
        } else {
            if (B > C) {
                max = B;
            } else {
                max = C;
            }
        }

        // Menentukan bilangan minimum
        if (A < B) {
            if (A < C) {
                min = A;
            } else {
                min = C;
            }
        } else {
            if (B < C) {
                min = B;
            } else {
                min = C;
            }
        }

        System.out.println("Bilangan maksimum = " + max);
        System.out.println("Bilangan minimum = " + min);
    }
}