// 49. Find the larger of two numbers

import java.util.Scanner;

public class larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The larger number is: " + a);
        }
        else if (a < b) {
            System.out.println("The larger number is: " + b);
        }
        else {
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}