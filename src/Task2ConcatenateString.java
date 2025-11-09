//Write a Java program to concatenate a given string to the end of another string.
// Sample Output:
// String 1: Java Exercises and
// String 2: Python Exercises
// Result: Java Exercises and Python Exercises

// Steps / method:
// Assign the string characters to a variable
// used the concat() method to concatenate to build a sentence with both text and variables




public class Task2ConcatenateString {
    public static void main(String[] args) {
        // Assign the string characters to a variable

        String text1 = "Java Exercises and ";
        String text2 = "Python Exercises";

        //used the concat method to concatenate text1 to text2 and assign to a result variable
        String result = text1.concat(text2);

        //print the result
        System.out.println(result);
    }
}
