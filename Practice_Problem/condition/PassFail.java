// 60. Determine pass/fail from marks using a given pass mark.

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter pass mark: ");
        double passMark = sc.nextDouble();

        if (marks >= passMark) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
