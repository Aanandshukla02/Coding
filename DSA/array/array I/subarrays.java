public class subarrays {
    // Function to print all subarrays of the given array
    public static void printsubarray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;

            // Nested loop to iterate over all possible subarrays starting from 'start'
            for (int j = i; j < number.length; j++) {
                int end = j;

                // Loop to print the elements of the current subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println(); // Move to the next line after printing a subarray
            }
            System.out.println(); // Separate subarrays with an empty line
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};

        // Call the function to print all subarrays
        printsubarray(number);
    }
}
