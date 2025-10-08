import java.util.Scanner;

public class MaxMinOperatorLogika09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        int max, min;

        System.out.print("Masukkan bilangan A: ");
        A = sc.nextInt();
        System.out.print("Masukkan bilangan B: ");
        B = sc.nextInt();
        System.out.print("Masukkan bilangan C: ");
        C = sc.nextInt();

        // Menentukan bilangan maksimum 
        if ((A >= B) && (A >= C)) {
            max = A;
        } else if ((B >= A) && (B >= C)) {
            max = B;
        } else {
            max = C;
        }

        // Menentukan bilangan minimum 
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