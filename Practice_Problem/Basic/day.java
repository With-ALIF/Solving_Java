// 24.  Convert a given number of days into weeks and remaining days

import java.util.Scanner;

public class day {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the days: ");
        int d = sc.nextInt();

        int week = d / 7;
        int day = d % 7;

        System.out.println("The week: " + week + " " );
        System.out.println("The days: " + day);
        sc.close();
    }
}