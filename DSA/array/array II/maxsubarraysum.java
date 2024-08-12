public class maxsubarraysum {
    // Function to find the maximum subarray sum using the brute-force approach
    public static void maxsubarray(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        // Nested loops to iterate over all possible subarrays
        for (int i = 0; i < number.length; i++) {
            int start = i;

            // Iterate over all possible subarrays starting from 'start'
            for (int j = i; j < number.length; j++) {
                int end = j;

                // Calculate the sum of the current subarray
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += number[k];
                }

                // Print the sum of the current subarray
                System.out.println(currsum);

                // Update maxsum if the current sum is greater
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Max sum--> " + maxsum);
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};

        // Call the function to find and print the maximum subarray sum using brute-force
        maxsubarray(number);
    }
}
