// Write a Java program to get the length of a given string.
// Sample Output:
// The string length of 'example.com' is: 11

// Steps / method:
// Use the length() method to get the length of a given string. Return the number of characters in a string:

// Declare and assign the string
// Call the method to get the length
// Print the returned value

public class Task4GetLength {

    // method to return string length
    public static int getStringLength(String text) {
        return text.length();
    }

    public static void main(String[] args) {

        // Declare and assign string
        String myStr = "example.com";

        // Call the method
        int result = getStringLength(myStr);

        // Print result
        System.out.println("The string length of '" + myStr + "' is: " + result);
    }
}
