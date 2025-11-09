
// Write a Java program to get the character at the given index within the string
// Sample Output:
// Original String = Java Exercises!
//The character at position 0 is J
// The character at position 10 is i


// Steps / method:
// Assign the string characters to a variable
// use charAt()  method on the string to get the character of the specified index and assign to a variable
// concatenate the sentence with the result variable


public class Task1GetIndex {
    public static void main(String[] args) {
        String myStr = "Java Exercises!";
        //use charAt method on the string and assign to a variable
        char result1 = myStr.charAt(0);
        char result2 = myStr.charAt(10);

        // concatenate the sentence with the result variable
        System.out.println("The character at position 0 is " + result1);
        System.out.println("The character at position 10 is " + result2);
    }

}