// 62. Check whether three sides can form a triangle.

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The sides can form a valid triangle.");
        } else {
            System.out.println("The sides cannot form a valid triangle.");
        }

        sc.close();
    }
}
