//36. Convert a three-digit number into its reverse using arithmetic operators

import java.util.Scanner;

public class reverse {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int a = sc.nextInt();

        int b = a % 10;

        int c = a / 10;

        int d = c % 10;

        int e = a / 100;

        int reverse = b*100 + d*10 + e;

        System.out.println("The reverse number: " + reverse);

        sc.close();
    }
}