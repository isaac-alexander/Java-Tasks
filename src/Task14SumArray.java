//Write a Java Program to Compute the Sum of Array Elements.
//Input: [ 2, 4, 6, 7, 9]
//Output: 28

// Steps / method:

// This method will accept an array of integers called numbers
// It will calculate the total sum of all elements and return the sum
// Create a variable to store the total called sum
// Loop through the array from index 0 to the last index
// For each element, add it to the sum variable
// After the loop ends, return the sum


public class Task14SumArray {
    // Method to compute the sum of array elements
    public static int sumArray(int[] numbers) {
        int sum = 0; // starting total

        for (int num : numbers) {
            sum = sum + num; // add each element to sum
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 9 };

        int result = sumArray(arr);

        System.out.println("Sum of array elements: " + result); // Output: 28
    }
}
