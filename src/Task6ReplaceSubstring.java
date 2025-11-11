// Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
//Sample Output: Replace 'fox' with 'cat'
//Original string: The quick brown fox jumps over the lazy dog.
//New String: The quick brown cat jumps over the lazy dog.



// Steps / method:
// used the replaceFirst() method to Replace 'fox' with 'cat'
// The replaceFirst() method replaces the first match of a regular expression in a string with a new substring.

// Declare and assign the string
// Call the method to replace the first match
// Print the returned string


public class Task6ReplaceSubstring {

    // Method that replaces the first occurrence of a substring
    public static String replaceFirstMatch(String text, String target, String replacement) {
        // replaceFirst() replaces only the first match found
        return text.replaceFirst(target, replacement);
    }

    public static void main(String[] args) {
        // Call method and print new string
        String result = replaceFirstMatch("The quick brown fox jumps over the lazy dog.", "fox", "cat");
        System.out.println(result);
    }
}
