// 32. Calculate the sum of two fractions given numerator and denominator.

import java.util.Scanner;

public class numerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator of first fraction: ");
        int n1 = sc.nextInt();

        System.out.print("Enter denominator of first fraction: ");
        int d1 = sc.nextInt();

        System.out.print("Enter numerator of second fraction: ");
        int n2 = sc.nextInt();

        System.out.print("Enter denominator of second fraction: ");
        int d2 = sc.nextInt();

        if (d1 == 0 || d2 == 0) {
            System.out.println("Denominator cannot be zero.");
            sc.close();
            return;
        }

        int numerator = n1 * d2 + n2 * d1;
        int denominator = d1 * d2;

        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        System.out.println("Sum: " + numerator + "/" + denominator);
        sc.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}