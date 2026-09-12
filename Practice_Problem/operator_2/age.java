// 35. Calculate a person's age in months and days approximately from years

import java.util.Scanner;

public class age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age in years: ");
        int years = sc.nextInt();

        int months = years * 12;
        int days   = years * 365;

        System.out.println("Age in months : " + months);
        System.out.println("Age in days   : " + days);

        sc.close();
    }
}