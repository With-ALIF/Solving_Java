// 54. Check whether a character is a vowel or consonant

import java.util.Scanner;

public class checkword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
            ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'U' || ch == 'O') {
                System.out.println("The character is a vowel");
            }
        else {
            System.out.println("The character is a consonant");
        }

        sc.close();
    }
}