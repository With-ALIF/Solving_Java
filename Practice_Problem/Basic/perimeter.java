// 9. Calculate the perimeter of a rectangle.

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The height of the rectangle: ");
        int height = sc.nextInt();

        System.out.print("The width of the rectangle: ");
        int width = sc.nextInt();

        System.out.println("The perimeter of the rectangle is : " + 2 * (height + width));
        sc.close();
    }
}