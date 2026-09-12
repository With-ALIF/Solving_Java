// 75. Determine the quadrant of a point (x, y).

import java.util.Scanner;

public class PointQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinates (x and y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in Quadrant IV.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point is at the Origin (0, 0).");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } else {
            System.out.println("The point lies on the X-axis.");
        }

        sc.close();
    }
}
