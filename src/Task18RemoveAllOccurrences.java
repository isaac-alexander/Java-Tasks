// Java Array Program to Remove All Occurrences of an Element in an Array
// Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
// Output: [2, 3, 5]
//Explanation: all the occurrences of element 1 is removed from the array So, array becomes from [ 1, 2, 1, 3, 5, 1 ]  to Final result: [2, 3, 5]


public class Task18RemoveAllOccurrences {

    public static int[] removeKey(int[] arr, int key) {
        // Create a new temporary array to store numbers that are NOT equal to the key

        // Create a counter (index) to track how many valid values we store

        // Loop through the original array

        // Inside loop: check if arr[i] is NOT equal to key

        // If value is not the key, save it into the temporary array and increase index

        // After loop: create a final array using the exact number of valid items (index)

        // Copy only the valid values from temporary array to final array

        // Return the final array without the removed key

        return new int[0]; // dummy return value
    }

    public static void printArray(int[] arr) {
        // Loop through array

        // Print each number manually with spaces

        // Close the bracket after printing all numbers
    }

}
