// Write a Java program to check whether a given string starts with another string.
// Sample Output:
// Red is favorite color. starts with Red? true
// Orange is also my favorite color. starts with Red? false


// Steps / method:
// Use the startsWith() method checks whether a string starts with the specified character(s). Returns a Boolean value (True or False(

// Declare and assign both strings
// Call the method to check the beginning
// Print results

public class Task7StartWith {

    // Method to check if text begins with a specific prefix
    public static boolean checkStartsWith(String text, String prefix) {
        // startsWith() returns true or false
        return text.startsWith(prefix);
    }

    public static void main(String[] args) {
        // Print results of checks
        System.out.println(checkStartsWith("Red is favorite color.", "Red"));
        System.out.println(checkStartsWith("Orange is also my favorite color.", "Red"));
    }
}
