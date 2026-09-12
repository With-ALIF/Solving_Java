// 13. Calculate the average of three numbers

import java.util.Scanner;

class avarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = (a + b + c) / 3.0;

        System.out.printf("The average: %.2f\n", d);
        sc.close();
    }
}
