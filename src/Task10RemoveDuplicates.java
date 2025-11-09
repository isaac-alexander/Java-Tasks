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
    public static void main(String[] args) {
        // 1. Assign the string
        String str = "bobby";
        System.out.println("The given string is: " + str);

        // 2. This will store the string without duplicates
        String newStr = "";

        // 3. Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            // 4. Check if newStr already has this character
            if (newStr.indexOf(letter) == -1) {
                // 5. If not found, add it
                newStr = newStr + letter;
            }
        }

        // 6. Display the result
        System.out.println("After removing duplicates characters the new string is: " + newStr);
    }
}
