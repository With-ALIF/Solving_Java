// 20. Read a two-digit number and print its digits separately. twodigit

import java.util.Scanner;

public class twodigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two digit number: ");
        int a = sc.nextInt();
      
        int b = a / 10;

        int c = a % 10;

        System.out.println("The number is: " + b + " " + "and" + " " + c);
        sc.close();
    }
}