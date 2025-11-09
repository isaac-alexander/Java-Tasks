// Write a Java program to check whether a given string starts with another string.
// Sample Output:
// Red is favorite color. starts with Red? true
// Orange is also my favorite color. starts with Red? false


// Steps / method:
// Assign the strings characters to variables
// used the startsWith() method checks whether a string starts with the specified character(s). Returns a Boolean value (True or False(

public class Task7StartWith {
    public static void main(String[] args) {
        // Assign the strings characters to variables
        String myStr1 = "Red is favorite color. starts with Red?";
        String myStr2 = "Orange is also my favorite color. starts with Red?";

        // used the startsWith() method checks whether a string starts with the specified character(s).
        Boolean result1 = myStr1.startsWith("Red");
        Boolean result2 = myStr2.startsWith("Red");

        System.out.println(result1); //true
        System.out.println(result2); // false
    }
}
