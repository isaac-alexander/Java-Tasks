// Write a Java program to test if a given string contains a specified sequence of characters.
// Sample Output:
// Result: true

// Steps / method:
// Use the  .contain() string method to Find out if a string contains a sequence of characters. It gives it's returns a boolean value(True or False)

// Declare and assign the string
// Call the method with the target word
// Print the returned boolean result

public class Task3ContainsSpecificChar {

    // method to check if string contains a word
    public static boolean containsWord(String text, String word) {
        return text.contains(word); // returns true or false
    }

    public static void main(String[] args) {

        // Declare and assign string
        String myStr = "PHP Exercises and Python Exercises";

        // Call the method
        boolean result = containsWord(myStr, "and");

        // Print result
        System.out.println(result);
    }
}

