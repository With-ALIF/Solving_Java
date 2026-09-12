// 42. Calculate the total cost after tax and discount

import  java.util.Scanner;

public class tax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the product: ");
        double amount = sc.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discount = sc.nextDouble();

        double discountAmount = amount * discount / 100;

        double afterprice = amount - discountAmount;

        System.out.print("Enter the tax percentage: ");
        double tax = sc.nextDouble();

        double taxAmount = afterprice * tax / 100;

        double total = afterprice + taxAmount;

        System.out.println("Total amount: " + total);

        sc.close();
    }
}