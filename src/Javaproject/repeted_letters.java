package Javaproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class repeted_letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> letterCountMap = countLetters(input);

        System.out.println("Letter counts:");
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    // Function to count the number of times each letter is repeated in a string
    public static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
            }
        }

        return letterCountMap;
    }
}
