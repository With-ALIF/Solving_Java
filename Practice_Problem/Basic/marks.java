//23. Calculate a student's total marks and percentage for five subjects

import java.util.Scanner;

public class marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.00;
        double full_marks = 0.00;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter subject " + i + " marks: ");
            double marks = sc.nextDouble();

            System.out.print("Enter subject " + i + " full marks: ");
            double full = sc.nextDouble();

            total += marks;
            full_marks += full;
        }

        double percentage = (total / full_marks) * 100;

        System.out.println("\nTotal marks: " + total);
        System.out.println("Full marks: " + full_marks);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
