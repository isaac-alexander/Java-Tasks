//Write a Java program to replace a specified character with another character.
//Sample Output: Replace 'd' with 'f'
//Original string: The quick brown fox jumps over the lazy dog.
//New String: The quick brown fox jumps over the lazy fog.


// Steps / method:
// Use the replace() method to replace 'd' with 'f' and assign to result variable. The replace() method searches a string for a specified character, and returns a new string where the specified character(s) are replaced.

// Declare and assign the string
// Call the method with the old and new characters
// Print the returned string

public class Task5ReplaceCharacter {

    // method to replace a character
    public static String replaceCharacter(String text, char oldChar, char newChar) {
        return text.replace(oldChar, newChar);
    }

    public static void main(String[] args) {

        // Declare and assign string
        String myStr = "The quick brown fox jumps over the lazy dog";

        // Call the method
        String result = replaceCharacter(myStr, 'd', 'f');

        // Print result
        System.out.println(result);
    }
}
