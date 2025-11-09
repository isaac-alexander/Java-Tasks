// Write a Java program to find the most frequent character in a given string.
// Sample Output:
// The given string is: successes
// The second most frequent char in the string is: c


// Steps / method:
// 1. Store the string in a variable.
// 2. Create an array to count how many times each character appears.
// 3. Loop through the string and increase the count for each character.
// 4. Find the highest frequency (most repeated character).
// 5. Then find the second-highest frequency and show that character.

public class Task9MostFrequentCharacter {
    public static void main(String[] args) {
        // 1. Store the string
        String str = "successes";
        System.out.println("The given string is: " + str);

        // 2. Create an array to count character frequencies (256 covers all basic characters)
        int[] count = new int[256];

        // 3. Count how many times each character appears
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            count[letter] = count[letter] + 1;
        }

        // 4. Find the highest frequency
        int highest = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > highest) {
                highest = count[i];
            }
        }

        // 5. Find the second-highest frequency
        int secondHighest = 0;
        char secondChar = ' ';

        for (int i = 0; i < count.length; i++) {
            if (count[i] > secondHighest && count[i] < highest) {
                secondHighest = count[i];
                secondChar = (char) i; // convert index back to character
            }
        }

        System.out.println("The second most frequent char in the string is: " + secondChar);
    }
}
