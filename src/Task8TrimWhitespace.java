//Write a Java program to trim leading or trailing whitespace from a given string.
//Sample Output:
//Original String:       Java Exercises
//New String: Java Exercises


// Steps / method:
// Assign the string characters to a variable
// used the trim() method removes whitespace from both ends of a string.

public class Task8TrimWhitespace {
    public static void main(String[] args) {
        // Assign the string characters to a variable
        String myStr = "       Java Exercises        ";

        // original text with whitespace
        String result1 = myStr;

        // trim method to remove whitespace
        String result2 = myStr.trim();

        System.out.println(result1); //        Java Exercises
        System.out.println(result2); // Java Exercises
    }
}
