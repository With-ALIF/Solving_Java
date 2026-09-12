// 45. Given marks in several subjects, calculate weighted average

import java.util.Scanner;

public class weightedAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double totalWeightedMarks = 0;
        double totalWeight = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            double mark = sc.nextDouble();

            System.out.print("Enter weight of subject " + i + ": ");
            double weight = sc.nextDouble();

            totalWeightedMarks += mark * weight;
            totalWeight += weight;
        }

        double weightedAverage = totalWeightedMarks / totalWeight;

        System.out.printf("Weighted Average: %.2f\n", weightedAverage);

        sc.close();
    }
}