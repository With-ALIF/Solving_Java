// 25. Calculate the final amount using principal, rate, and time for simple interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;

        double amount = principal + interest;

        System.out.println("Simple Interest: " + interest);
        System.out.println("Final Amount: " + amount);

        sc.close();
    }
}