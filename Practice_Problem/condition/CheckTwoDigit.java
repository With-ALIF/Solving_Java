// 68. Check whether a number is a two-digit number.

import java.util.Scanner;

public class CheckTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int absVal = Math.abs(num);

        if (absVal >= 10 && absVal <= 99) {
            System.out.println(num + " is a two-digit number.");
        } else {
            System.out.println(num + " is not a two-digit number.");
        }

        sc.close();
    }
}
