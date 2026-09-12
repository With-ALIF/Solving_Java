// 44. Calculate the percentage decrease between an old and new value.

import java.util.Scanner;

public class decrease{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter old price: ");
        double old = sc.nextDouble();

        System.out.print("Enter the new price: ");
        double newPrice = sc.nextDouble();

        double decrease = old - newPrice;
        double percentageDecrease = (decrease / old) * 100;

        System.out.println("The percentage decrease is: " + percentageDecrease);

        sc.close();
    }
}
