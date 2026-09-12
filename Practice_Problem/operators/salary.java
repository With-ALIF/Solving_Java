// 34. Calculate a salary after adding a percentage bonus

import java.util.Scanner;

public class salary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base salary: ");
        int a = sc.nextInt();

        System.out.print("Enter the bonus percentage amount: ");
        int b = sc.nextInt();

        double c = (double)b / 100;

        double d = a + (a * c);

        System.out.println("The final balance: " + d);

        sc.close();

    }
}