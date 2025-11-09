// Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
//Sample Output: Replace 'fox' with 'cat'
//Original string: The quick brown fox jumps over the lazy dog.
//New String: The quick brown cat jumps over the lazy dog.



// Steps / method:
// Assign the string characters to a variable
// used the replaceFirst() method to Replace 'fox' with 'cat'
// The replaceFirst() method replaces the first match of a regular expression in a string with a new substring.

public class Task6ReplaceSubstring {
    public static void main(String[] args) {
        // Assign the string characters to a variable
        String myStr = "The quick brown fox jumps over the lazy dog.";
        // Assign the new character to a variable
        String regex = "cat";

        // used the replaceFirst() method to Replace 'fox' with 'cat' and assign to result variable
        String result = myStr.replaceFirst(regex, "at");

        System.out.println(result);
    }
}
