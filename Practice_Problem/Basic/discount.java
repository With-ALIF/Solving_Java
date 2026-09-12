// 22. Calculate total bill after applying a percentage discount.

import java.util.Scanner;

public class discount {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tthe bill amount: ");
        int bill = sc.nextInt();

        System.out.print("Enter the discount amount: ");
        int discount = sc.nextInt();

        double flat = (double)discount / 100;

        double t_bil = bill - (bill * flat);

        System.out.println("The total bill: " + t_bil);
        
        sc.close();
    }
}
    