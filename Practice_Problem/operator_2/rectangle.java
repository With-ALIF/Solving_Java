// 38. Calculate the diagonal of a rectangle
import java.util.Scanner;

public  class rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of rectangle: ");
        int a = sc.nextInt();

        System.out.print("Enter the width of rectangle: ");
        int b = sc.nextInt();

        int c = (a *2 ) + (b *2);
        System.err.println("The diagonal of the rectangle: " + c);

        sc.close();
    }
}