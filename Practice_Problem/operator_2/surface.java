// 40. Calculate the surface area of a cuboid


import java.util.Scanner;

public class surface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of cuboid: ");
        double length = input.nextDouble();

        System.out.print("Enter width of cuboid: ");
        double width = input.nextDouble();

        System.out.print("Enter height of cuboid: ");
        double height = input.nextDouble();

        double surfaceArea = 2*(length * width + width * height + height * length);

        System.out.println("Surface area of cuboid: " + surfaceArea);

        input.close();
    }   
}