package Day1;

import java.util.Scanner;

public class EvenNumbers {
    public static void generateEvenNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many even numbers you want to generate: ");
        int n = scanner.nextInt();
        System.out.println("First " + n + " even numbers are:");
        generateEvenNumbers(n);
    }
}
