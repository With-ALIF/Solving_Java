//11 . Calculate the area of a triangle using base and height.

public class triangle {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle is : %.2f%n", area);

        sc.close();
    }
}
