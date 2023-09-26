package Javaproject;

import java.util.Scanner;

public class remove_first_last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() < 2) {
            System.out.println("The string is too short to remove first and last characters.");
        } else {
            String result = removeFirstAndLastCharacters(input);
            System.out.println("Modified string: " + result);
        }

        scanner.close();
    }

    // Function to remove first and last characters from a string
    public static String removeFirstAndLastCharacters(String str) {
        return str.substring(1, str.length() - 1);
    }
}
