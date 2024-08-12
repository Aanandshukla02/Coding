public class kadanesmethod {
    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static void kadane(int[] number) {
        int ms = Integer.MIN_VALUE; // Initialize max subarray sum to the minimum integer value
        int cs = 0; // Initialize current subarray sum to 0

        // Iterate through the array
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i]; // Add the current element to the current subarray sum
            if (cs < 0) {
                cs = 0; // If the current subarray sum becomes negative, reset it to 0
            }
            ms = Math.max(cs, ms); // Update the max subarray sum
        }

        System.out.println("Our max subarray sum is --> " + ms);
    }

    public static void main(String[] args) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        // Call the function to find and print the maximum subarray sum
        kadane(number);
    }
}
