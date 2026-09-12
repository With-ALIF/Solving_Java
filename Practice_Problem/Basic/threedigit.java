// 21.  Read a three-digit number and print the hundreds, tens, and units digits.

import java.util.Scanner;

public class threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three digit number: ");
        int a = sc.nextInt();
      
        int hundreds = a / 100;

        int b  = a % 100;

        int  tens = b / 10;

        int units = b % 10;

        System.out.println("The hundreds: " + hundreds + " tens: " + tens + " units: " + units);

        sc.close();
    }
}