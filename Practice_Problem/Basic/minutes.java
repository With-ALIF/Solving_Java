// 17. Convert total minutes into hours and remaining minutes

import java.util.Scanner;

public class minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the minutes: ");
        int minutes = sc.nextInt();

        int hours = minutes / 60;
        int rem = minutes % 60;

        System.out.println("The hours : " + hours + "\n The remaining minutes: " + rem);
        sc.close();
    }
    
}