//6.  Convert a temperature from Celsius to Fahrenheit

import java.util.Scanner;

public class celcius {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
       
       double celsius = sc.nextDouble();

       double f = (celsius * 9/5) + 32;

       System.out.println("Temperature in Fahrenheit: " + f);

       sc.close();

    }
}
