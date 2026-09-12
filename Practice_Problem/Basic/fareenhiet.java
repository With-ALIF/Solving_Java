// 7. Convert a temperature from Fahrenheit to Celsius

import java.util.Scanner;

public class fareenhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit: ");

        double f = sc.nextDouble();

        double c = (f - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + c);

        sc.close();
    }
}
