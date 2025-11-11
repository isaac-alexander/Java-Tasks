// Write a Java program to get the character at the given index within the string.
// Sample Output:
// Original String = Java Exercises!
// The character at position 0 is J
// The character at position 10 is i

// Steps / method:
// Use charAt()  to get the character of the specified index

// Declare and assign the string to a variable
// Call the method with the string and index value
// Print the returned character

public class Task1GetIndex {

    // Helper method to return the character at a given index
    public static char getCharacterAtIndex(String text, int index) {
        return text.charAt(index); // get the character at the specified position
    }

    public static void main(String[] args) {

        // Declare and assign the string
        String myStr = "Java Exercises!";

        // Call the method
        char result1 = getCharacterAtIndex(myStr, 0);
        char result2 = getCharacterAtIndex(myStr, 10);

        // Print the results
        System.out.println("The character at position 0 is " + result1);
        System.out.println("The character at position 10 is " + result2);
    }
}
