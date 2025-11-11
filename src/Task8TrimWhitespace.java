//Write a Java program to trim leading or trailing whitespace from a given string.
//Sample Output:
//Original String:       Java Exercises
//New String: Java Exercises


// Steps / method:
// Use the trim() method removes whitespace from both ends of a string.

// Declare and assign the string
// Call the method to trim spaces
// Print both original and trimmed output

public class Task8TrimWhitespace {

    // Method that removes leading and trailing spaces
    public static String trimText(String text) {
        // trim() removes whitespace at both ends
        return text.trim();
    }

    public static void main(String[] args) {
        // Store original string
        String original = "       Java Exercises        ";
        // Call trim method
        String trimmed = trimText(original);

        // Show before and after
        System.out.println(original);
        System.out.println(trimmed);
    }
}
