public class pairsinarray {
    // Function to print all pairs in the array
    public static void printpairs(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];

            // Nested loop to find pairs with the current element
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")"); // Print the pairs
            }
            System.out.println(); // Move to the next line after printing pairs for the current element
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};

        // Call the function to print pairs in the array
        printpairs(number);
    }
}
