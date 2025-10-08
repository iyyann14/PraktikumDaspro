import java.util.Scanner;

public class MaxMinOperatorLogika09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C;
        int max, min;

        System.out.print("Masukkan bilangan A: ");
        A = input.nextInt();
        System.out.print("Masukkan bilangan B: ");
        B = input.nextInt();
        System.out.print("Masukkan bilangan C: ");
        C = input.nextInt();

        // Menentukan bilangan maksimum menggunakan operator logika
        if ((A >= B) && (A >= C)) {
            max = A;
        } else if ((B >= A) && (B >= C)) {
            max = B;
        } else {
            max = C;
        }

        // Menentukan bilangan minimum menggunakan operator logika
        if ((A <= B) && (A <= C)) {
            min = A;
        } else if ((B <= A) && (B <= C)) {
            min = B;
        } else {
            min = C;
        }

        System.out.println("Bilangan maksimum = " + max);
        System.out.println("Bilangan minimum = " + min);
    }
}