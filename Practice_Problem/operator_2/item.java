// 33. Calculate the total price of items given quantity and unit price

import java.util.Scanner;

public class item {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter the unit price: ");
        int unit = sc.nextInt();

        int total = quantity * unit;

        System.out.println("The total price: " + total);

        sc.close();

    }
}