// 70. Check whether a given date's month number is valid (1-12).

import java.util.Scanner;

public class ValidMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Month " + month + " is a valid month number.");
        } else {
            System.out.println("Month " + month + " is an invalid month number (must be between 1 and 12).");
        }

        sc.close();
    }
}
