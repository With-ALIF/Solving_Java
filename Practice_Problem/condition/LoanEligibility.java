// 74. Determine whether a person is eligible for a loan using age and income rules.

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter applicant age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        // Rules: Age between 21 and 60, and monthly income at least 30,000
        if (age >= 21 && age <= 60 && income >= 30000) {
            System.out.println("The applicant is eligible for a loan.");
        } else {
            System.out.println("The applicant is not eligible for a loan.");
            if (age < 21 || age > 60) {
                System.out.println("Reason: Age must be between 21 and 60.");
            }
            if (income < 30000) {
                System.out.println("Reason: Monthly income must be at least 30,000.");
            }
        }

        sc.close();
    }
}
