// 65. Calculate electricity bill using slab-based rates.

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        double bill = 0;

        // Slab rates:
        // 1 - 100 units  : 1.50 per unit
        // 101 - 200 units: 2.50 per unit
        // 201 - 300 units: 4.00 per unit
        // Above 300 units: 5.00 per unit

        if (units <= 0) {
            bill = 0;
        } else if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } else if (units <= 300) {
            bill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.00);
        } else {
            bill = (100 * 1.50) + (100 * 2.50) + (100 * 4.00) + ((units - 300) * 5.00);
        }

        System.out.println("Total Electricity Bill: " + bill);

        sc.close();
    }
}
