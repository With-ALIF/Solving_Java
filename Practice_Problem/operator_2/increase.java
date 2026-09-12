//43. Calculate the percentage increase between an old and new value

import java.util.Scanner;

public class increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter old price: ");
        double old = sc.nextDouble();

        System.out.print("Enter new price: ");
        double newPrice = sc.nextDouble();

        double increase = newPrice - old;
        double percentageIncrease = (increase / old) * 100;

        System.out.println("The percentage increase is: " + percentageIncrease);

        sc.close(); 
    }
}
