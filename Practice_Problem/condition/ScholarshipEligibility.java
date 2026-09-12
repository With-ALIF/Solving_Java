// 73. Check whether a student gets scholarship based on marks and income.

import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks percentage: ");
        double marks = sc.nextDouble();

        System.out.print("Enter annual family income: ");
        double income = sc.nextDouble();

        // Scholarship criteria: Marks >= 80% AND Annual Family Income <= 250,000
        if (marks >= 80 && income <= 250000) {
            System.out.println("Congratulations! The student is eligible for scholarship.");
        } else {
            System.out.println("The student is not eligible for scholarship.");
            if (marks < 80) {
                System.out.println("Reason: Marks must be at least 80%.");
            }
            if (income > 250000) {
                System.out.println("Reason: Annual family income must not exceed 250,000.");
            }
        }

        sc.close();
    }
}
