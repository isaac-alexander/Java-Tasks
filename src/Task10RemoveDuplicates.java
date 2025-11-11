// Write a Java program to print the result of removing duplicates from a given string.
// Sample Output:
// The given string is: bobby
// After removing duplicates characters the new string is: boy

// Steps / method:
// 1. Assign the string to a variable.
// 2. Create an empty string to store characters we keep.
// 3. Loop through each character in the string.
// 4. For each character, check if it is already in the new string.
// 5. If not, add it to the new string.
// 6. Print the final string without duplicates.

public class Task10RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicateChars(String str) {
        String newStr = ""; // 2. Create empty string to store unique characters

        // 3. Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            // 4. Check if newStr already has this character
            if (newStr.indexOf(letter) == -1) {
                newStr = newStr + letter; // 5. Add if not found
            }
        }

        return newStr; // 6. Return the string without duplicates
    }

    public static void main(String[] args) {
        String str = "bobby"; // 1. Assign the string
        System.out.println("The given string is: " + str);

        // Call the  method
        String result = removeDuplicateChars(str);

        System.out.println("After removing duplicates characters the new string is: " + result);
    }
}
