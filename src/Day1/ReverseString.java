package Day1;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

    }
}
