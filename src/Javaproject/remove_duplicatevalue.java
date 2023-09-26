package Javaproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class remove_duplicatevalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numCount = scanner.nextInt();
        int[] numbers = new int[numCount];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] newArray = removeDuplicates(numbers);
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));

        scanner.close();
    }

    // Function to remove duplicate values from an array
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        int[] newArray;

        for (int num : array) {
            uniqueSet.add(num);
        }

        newArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            newArray[index++] = num;
        }

        return newArray;
    }
}
