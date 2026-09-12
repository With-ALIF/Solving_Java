// 52. Find the smallest of three numbers

import java.util.Scanner;

public class smallestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three number: ");
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b && a < c) {
            System.out.println("The smaller number is: " + a);
        } else if ( b < a && b < c) {
            System.out.println("The smaller number is: " + b);
        }  else {
            System.out.println("The smaller number is: " + c);
        }

        sc.close();

    }
}
