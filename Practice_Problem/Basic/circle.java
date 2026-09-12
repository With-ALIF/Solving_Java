// 10. Calculate e the area and circumference of a circle

import java.util.Scanner;

public class circle {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("The radius of the circle: ");

        double radius = sc.nextDouble();

        System.out.printf("The area of the circle is : %.2f%n", 3.14 * radius * radius);

        System.out.printf("The circumference of the circle is : %.2f%n", 2 * 3.14 * radius);

        sc.close();
        
    }
}
