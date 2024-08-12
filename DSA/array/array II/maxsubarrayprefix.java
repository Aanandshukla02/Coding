public class maxsubarrayprefix {
    // Function to find the maximum subarray sum using prefix sum
    public static void maxsubarraysum(int[] number) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];

        // Calculate prefix sum array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        // Nested loops to find the maximum subarray sum using prefix sum
        for (int i = 0; i < prefix.length; i++) {
            int start = i;

            // Iterate over all possible subarrays starting from 'start'
            for (int j = i; j < prefix.length; j++) {
                int end = j;

                // Calculate the sum of the subarray using prefix sum
                currsum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                // Update maxsum if the current sum is greater
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("maxsum-> " + maxsum);
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};

        // Call the function to find and print the maximum subarray sum using prefix sum
        maxsubarraysum(number);
    }
}
