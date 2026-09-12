// 29. Check the result of integer division versus floating-point division

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int intDiv = a / b;

        double floatDiv = (double) a / b;

        System.out.println("Integer Division (" + a + " / " + b + "): " + intDiv);
        System.out.println("Floating-Point Division (" + a + " / " + b + "): " + floatDiv);

        sc.close();
    }
}