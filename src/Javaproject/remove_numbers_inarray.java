package Javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class remove_numbers_inarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numCount = scanner.nextInt();
        int[] numbers = new int[numCount];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        if (numCount < 6) {
            System.out.println("Array is too small to remove elements.");
        } else {
            int[] newArray = removeElements(numbers, 4, 5); // Indices are 0-based
            System.out.println("Array after removing elements: " + Arrays.toString(newArray));
        }

        scanner.close();
    }

    // Function to remove elements from an array
    public static int[] removeElements(int[] array, int index1, int index2) {
        int newSize = array.length - 2;
        int[] newArray = new int[newSize];
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index1 && i != index2) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }
}
