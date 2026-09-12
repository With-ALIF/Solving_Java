// 47. Check whether a number is even or odd.

import java.util.Scanner;

public class evennumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The number is even");
        } 
        else {
            System.out.println("The number is odd");
        }

        sc.close(); 
    }
}