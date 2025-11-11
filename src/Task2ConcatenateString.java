// Write a Java program to concatenate a given string to the end of another string.
// Sample Output:
// Result: Java Exercises and Python Exercises

// Steps / method:
// Use the concat() method to concatenate to build a sentence with both text and variables

// Declare and assign both strings to variables
// Call the method to combine the strings
// Print the returned result

public class Task2ConcatenateString {

    // method to join two strings
    public static String joinStrings(String text1, String text2) {
        return text1.concat(text2); // concatenate text2 to text1
    }

    public static void main(String[] args) {

        // Declare and assign strings
        String text1 = "Java Exercises and ";
        String text2 = "Python Exercises";

        // Call the method and store result
        String result = joinStrings(text1, text2);

        // Print result
        System.out.println(result);
    }
}
