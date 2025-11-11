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

    // method to find the second most frequent character
    public static char getSecondMostFrequentChar(String str) {

        // Array to count how many times each character appears (256 for all standard characters)
        int[] count = new int[256];

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the character at position i
            char letter = str.charAt(i);

            // Increase that character's count in the array
            count[letter] = count[letter] + 1;
        }

        // Find the highest frequency
        int highest = 0;
        for (int value : count) {
            if (value > highest) {
                highest = value;
            }
        }

        // Find the second highest frequency
        int secondHighest = 0;
        char secondChar = ' ';

        // Loop through the count array again
        for (int i = 0; i < count.length; i++) {

            // If a character count is less than highest but more than current secondHighest
            if (count[i] < highest && count[i] > secondHighest) {
                secondHighest = count[i];   // update second highest count
                secondChar = (char) i;      // convert index back to character
            }
        }

        // Return the second most frequent character
        return secondChar;
    }

    public static void main(String[] args) {

        // Declare and assign the string
        String myStr = "successes";
        System.out.println("The given string is: " + myStr);

        // Call the method and store the returned character
        char result = getSecondMostFrequentChar(myStr);

        // Print the result
        System.out.println("The second most frequent char in the string is: " + result);
    }
}
