public class reversearray {
    // Function to reverse the elements in the array
    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;

        // Loop until the first index is less than the last index
        while (first < last) {
            // Swap the elements at the first and last indices
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            // Move towards the center of the array
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};

        // Call the function to reverse the array
        reverse(number);

        // Print the reversed array
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the reversed array
    }
}
