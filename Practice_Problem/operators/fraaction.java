// 32. Calculate the sum of two fractions given numerator and denominator.

import java.util.Scanner;

public class fraaction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator of first fraction: ");
        int num1 = sc.nextInt();

        System.out.print("Enter denominator of first fraction: ");
        int den1 = sc.nextInt();

        System.out.print("Enter numerator of second fraction: ");
        int num2 = sc.nextInt();

        System.out.print("Enter denominator of second fraction: ");
        int den2 = sc.nextInt();

        // Sum formula: a/b + c/d = (a*d + b*c) / (b*d)
        int sumNum = (num1 * den2) + (num2 * den1);
        int sumDen = den1 * den2;

        // Simplify using GCD
        int gcd = gcd(Math.abs(sumNum), Math.abs(sumDen));
        sumNum /= gcd;
        sumDen /= gcd;

        System.out.println("Result: " + num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + sumNum + "/" + sumDen);

        sc.close();
    }

    // Helper method to find GCD
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}