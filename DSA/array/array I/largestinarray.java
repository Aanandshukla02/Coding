public class largestinarray {
    // Function to find the largest element in an array
    public static int find(int number[]) {
        int Largest = Integer.MIN_VALUE; // Initialize Largest to the minimum integer value

        // Loop through the array to find the largest element
        for (int i = 0; i < number.length; i++) {
            if (Largest < number[i]) {
                Largest = number[i]; // Update Largest if a larger element is found
            }
        }
        return Largest; // Return the largest element
    }

    public static void main(String[] args) {
        int number[] = {90, 173, 46, 62, 94};

        // Print the largest value in the array
        System.out.println("Largest value is -->" + find(number));
    }
}
