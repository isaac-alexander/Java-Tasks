//Write a Java program to test if a given string contains the specified sequence of char values.
//Sample Output:
//Original String: PHP Exercises and Python Exercises
//Specified sequence of char values: and
//Result: true

// Steps / method:
// Assign the string characters to a variable
// Use the  .contain() string method to Find out if a string contains a sequence of characters. It gives it's returns a boolean value(True or False)


public class Task3ContainsSpecificChar {
    public static void main(String[] args) {
        // Assign the string characters to a variable
        String myStr = "PHP Exercises and Python Exercises";

        // Use the  .contain string
        System.out.println(myStr.contains("and")); // true
    }
}
