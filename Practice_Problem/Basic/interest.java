// 12. Calculate simple interest using principal, rate, and time.

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter the rate per year: ");
        double rate = sc.nextDouble();

        double r = rate / 100;

        System.out.print("Enetr the year: ");
        int time = sc.nextInt();

        double amount = principal * r * time;

        System.out.println("The total ineteres: " + amount);
        sc.close();

    }
 
}