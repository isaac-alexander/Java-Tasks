//Write a Java program to get the length of a given string.
//Sample Output:
//The string length of 'example.com' is: 11


// Steps / method:
// Assign the string characters to a variable
// used the length() method to get the length of a given string. Return the number of characters in a string:





public class Task4GetLength {
    static void main(String[] args) {
        String myStr = "example.com";
        int result = myStr.length();

        String mySentence = "The string length of 'example.com' is: ";

        // concatenate mySentence to myStr
        System.out.println(mySentence + result); // The string length of 'example.com' is: 11
    }
}
