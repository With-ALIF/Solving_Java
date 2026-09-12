// 19. Swap two numbers without using a third variable.

import java.util.Scanner;

public class withoutvarible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer variable: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a =  a + b;
        b = a - b;
        a = a - b;

        System.out.println("The swap number " + a + " " + b);
        sc.close();
    }
}