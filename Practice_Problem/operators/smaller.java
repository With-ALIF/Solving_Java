// 50. Find the smaller of two numbers

import java.util.Scanner;

public class smaller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter two number: ");

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        if (a < b) {
            System.out.println(a + " is smaller than " + b); 
        } else if (b < a) {
            System.out.println(b + " is smaller than " + a); 
        } else {
            System.out.println(a + " is equal to " + b); 
        } 

        sc.close();
    }
}