// 18. Swap two numbers using a third variable

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer variable: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = b;
        b = a;
        a = c;

        System.out.println("The swap number " + a + " " + b);
        sc.close();
    }
}