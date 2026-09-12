// 64. Determine whether a triangle is right-angled using its sides.

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            double a2 = a * a;
            double b2 = b * b;
            double c2 = c * c;

            double eps = 0.0001;
            if (Math.abs((a2 + b2) - c2) < eps || Math.abs((a2 + c2) - b2) < eps || Math.abs((b2 + c2) - a2) < eps) {
                System.out.println("The triangle is a Right-angled triangle.");
            } else {
                System.out.println("The triangle is not a Right-angled triangle.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }
}
