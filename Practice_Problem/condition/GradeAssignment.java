// 61. Assign a grade based on percentage ranges.

import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage (0-100): ");
        double percentage = sc.nextDouble();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid percentage.");
        } else if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
