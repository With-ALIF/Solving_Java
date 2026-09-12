// 69. Check whether a number is a three-digit number.

import java.util.Scanner;

public class CheckThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int absVal = Math.abs(num);

        if (absVal >= 100 && absVal <= 999) {
            System.out.println(num + " is a three-digit number.");
        } else {
            System.out.println(num + " is not a three-digit number.");
        }

        sc.close();
    }
}
