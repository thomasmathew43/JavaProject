package Javaproject;

import java.util.Scanner;

public class reverse_num_str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number array
        System.out.print("Enter the number of elements in the number array: ");
        int numCount = scanner.nextInt();
        int[] numbers = new int[numCount];

        System.out.println("Enter the elements of the number array:");
        for (int i = 0; i < numCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Taking user input for the string array
        System.out.print("Enter the number of elements in the string array: ");
        int strCount = scanner.nextInt();
        String[] strings = new String[strCount];

        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < strCount; i++) {
            strings[i] = scanner.next();
        }

        scanner.close();

        // Reversing the number array
        for (int i = 0; i < numCount / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numCount - 1 - i];
            numbers[numCount - 1 - i] = temp;
        }

        // Reversing the string array
        for (int i = 0; i < strCount / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strCount - 1 - i];
            strings[strCount - 1 - i] = temp;
        }

        // Displaying the reversed arrays
        System.out.println("Reversed number array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Reversed string array:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}
