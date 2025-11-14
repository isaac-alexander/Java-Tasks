//Write a Program to Find Factorial of a Number in Java.
//Input: 5
//Output: 120

// Factorial is:The factorial of a number means you multiply the number by all the whole numbers below it. Multiply the number by every number before it until you get to 1.

// Steps / method:

//This method will take one integer parameter called number and it will return the factorial of that number.
// Create a variable called result and set it to 1
// Loop from 1 up to the given number
// Multiply result by each number in the loop
// Return the final value stored in result

public class Task12FactorialProgram {
    // Method to calculate factorial
    public static int findFactorial(int number) {
        int result = 1; // start with 1

        // Multiply result by each number from 1 to number
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result; // return the final factorial
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = findFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
