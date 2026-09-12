// 15. Read an ASCII value and print the corresponding character

import java.util.Scanner;

public class asciichar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII value: ");
        int a = sc.nextInt();

        System.out.println("The corresponding character: " + (char)a);

        sc.close();
    }
}