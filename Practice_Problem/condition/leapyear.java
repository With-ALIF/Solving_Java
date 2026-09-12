// 53. Check whether a year is a leap year.

import  java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a year: ");
        int a = sc.nextInt();

        if(a % 400 == 0  || (a % 4 == 0 && a % 100 !=0 )) {
            System.out.println("This is a leap year.");
        } 
        else {
            System.err.println("This is not a leap year");
        }

        sc.close();
    }    
}
