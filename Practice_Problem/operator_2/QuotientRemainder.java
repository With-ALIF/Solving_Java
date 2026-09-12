// 37. Find the quotient and remainder for two given integers.

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = a / b;
        int d = a % b;

        System.out.println("The quotient number: " + c);
        System.out.println("The remainder number: " + d);

        sc.close();
    }
}
