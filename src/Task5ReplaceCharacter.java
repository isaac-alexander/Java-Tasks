//Write a Java program to replace a specified character with another character.
//Sample Output: Replace 'd' with 'f'
//Original string: The quick brown fox jumps over the lazy dog.
//New String: The quick brown fox jumps over the lazy fog.

// Steps / method:
// Assign the string characters to a variable
// used the replace() method to replace 'd' with 'f' and assign to result variable. The replace() method searches a string for a specified character, and returns a new string where the specified character(s) are replaced.


public class Task5ReplaceCharacter {
    public static void main(String[] args) {
        // Assign the string characters to a variable
        String myStr = "The quick brown fox jumps over the lazy dog";
        // used the replace() method to replace 'd' with 'f' and assign to result variable
        String result =  myStr.replace('d', 'f');
        System.out.println(result);
    }
}
