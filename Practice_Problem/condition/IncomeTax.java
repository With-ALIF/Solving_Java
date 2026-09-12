// 66. Calculate income tax using different income ranges.

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual taxable income: ");
        double income = sc.nextDouble();

        double tax = 0;

        // Income tax brackets:
        // 0 - 300,000         : 0%
        // 300,001 - 600,000   : 5%
        // 600,001 - 1,000,000 : 10%
        // Above 1,000,000     : 20%

        if (income <= 300000) {
            tax = 0;
        } else if (income <= 600000) {
            tax = (income - 300000) * 0.05;
        } else if (income <= 1000000) {
            tax = (300000 * 0.05) + ((income - 600000) * 0.10);
        } else {
            tax = (300000 * 0.05) + (400000 * 0.10) + ((income - 1000000) * 0.20);
        }

        System.out.println("Calculated Income Tax: " + tax);

        sc.close();
    }
}
