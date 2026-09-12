// 16. Convert total seconds into hours, minutes, and seconds

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;

        int rems = seconds % 3600;

        int minutes = rems / 60;

        int second = rems % 60;

        System.out.println("The converted " + hours +" hours " + minutes + " minutes " + second + " seconds" );

        sc.close();
    }
    
}