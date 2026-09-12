// 71. Determine the number of days in a month using month number and leap-year status.

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number.");
        } else {
            boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            int days;

            if (month == 2) {
                days = isLeapYear ? 29 : 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else {
                days = 31;
            }

            System.out.println("Year " + year + " (Leap Year: " + isLeapYear + ")");
            System.out.println("Month " + month + " has " + days + " days.");
        }

        sc.close();
    }
}
