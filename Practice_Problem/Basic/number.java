// 4. Read an integer and print its square and cube

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enetr a Number: ");
        int a = sc.nextInt();

        int b = a * a;
        int c = b * a;

        System.out.println("The square number: " + b);
        System.out.println("The cube number: " + c);
        sc.close();
    }    
}
