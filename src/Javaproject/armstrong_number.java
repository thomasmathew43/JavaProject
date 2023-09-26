package Javaproject;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int numberOfDigits = (int) Math.log10(n) + 1;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }
}
