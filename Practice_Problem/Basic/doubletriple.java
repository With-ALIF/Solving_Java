// 5. Read an integer and print its double and triple

import java.util.Scanner;

public class doubletriple {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a integer number: ");
        int a = sc.nextInt();

        System.out.println("The double number: " + a*2);
        System.out.println("The triple number: " + a*3);

        sc.close();

    }
}
