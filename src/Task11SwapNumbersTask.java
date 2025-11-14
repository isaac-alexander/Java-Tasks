//Write a Program to Swap Two Numbers
//Input: a=2  b=5
//Output: a=5  b=2

// Steps / method:
// This method will take two integer parameters called a and b, and it will swap their values.
// Print the original values of a and b
// Create a temporary variable to hold the value of a
// Assign the value of b to a
// Assign the temporary value (old a) to b
// Print the new swapped values of a and b

public class Task11SwapNumbersTask {

    // This method swaps two numbers and prints before & after
    public static void swapTwoNumbers(int a, int b) {
        // Print the original values
        System.out.println("Before Swap: a = " + a + "  b = " + b);

        // Use a temporary variable to store a
        int temp = a;

        // Put b into a
        a = b;

        // Put old a (stored in temp) into b
        b = temp;

        // Print the swapped values
        System.out.println("After Swap:  a = " + a + "  b = " + b);
    }

    public static void main(String[] args) {
        // Call the method and pass in the two numbers
        swapTwoNumbers(2, 5);
    }
}
