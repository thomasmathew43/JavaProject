package Javaproject;

public class handling_exception {
    public static void main(String[] args) {
        // Example 1: Using try-catch block for specific exception
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Example 2: Using try-catch block for multiple exceptions
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("Array element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Example 3: Using try-catch-finally block
        try {
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // Example 4: Using throws clause to propagate exceptions
        try {
            processFile("nonexistent.txt");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Custom method that throws an exception
    public static int divide(int a, int b) {
        return a / b;
    }

    // Custom method that throws an exception and is declared to do so
    public static void processFile(String filename) throws java.io.IOException {
        // Code to process the file (this is a simplified example)
        throw new java.io.IOException("File not found: " + filename);
    }
}
