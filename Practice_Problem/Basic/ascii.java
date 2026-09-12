// 14. Read a character and print its ASCII value

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch = sc.next().charAt(0);

        System.out.println("The ASCII Value is: " + (int)ch);
        sc.close();
    }
}
