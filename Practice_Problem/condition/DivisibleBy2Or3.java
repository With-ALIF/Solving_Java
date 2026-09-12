// 59. Check whether a number is divisible by 2 or 3.

import java.util.Scanner;

public class DivisibleBy2Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is divisible by 2 or 3.");
        } else {
            System.out.println(num + " is not divisible by 2 or 3.");
        }

        sc.close();
    }
}
