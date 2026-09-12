// 39. Calculate the volume of a cuboid

import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of cuboid: ");
        double length = input.nextDouble();

        System.out.println("Enter width of cuboid: ");
        double width = input.nextDouble();

        System.out.println("Enter height of cuboid: ");
        double height = input.nextDouble();

        double volume = length * width * height;

        System.out.println("Volume of cuboid: " + volume);

        input.close();
    }
}