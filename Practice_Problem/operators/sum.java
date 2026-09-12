// 31. Find the sum of the first and last digit of a three-digit number

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three digit number: ");

        int a = sc.nextInt();

        int b = a / 100;   // first digit
        int c = a % 10;    // last digit

        int d = b + c;

        System.out.println("The result: " + d);

        sc.close();
    }

}