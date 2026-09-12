// 27. Find the remainder when one integer is divided by another

import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter two integer value: ");
     int a = sc.nextInt();
     int b = sc.nextInt();

     int c = a % b;

     System.out.println("The remainder: " + c);

     sc.close();
    }
}