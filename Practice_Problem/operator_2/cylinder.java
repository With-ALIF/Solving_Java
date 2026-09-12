// 41. Calculate the volume of a cylinder.

import java.util.Scanner;

public class cylinder {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radious of the cylinder: ");

    double a = sc.nextDouble();

    System.out.print("Enter the height of the cylinder: ");

    double b = sc.nextDouble();

    double c = 3.1416 * a * a * b;

    System.out.println("The volume of the cylinder is: " + c);

    sc.close(); 
   }
}