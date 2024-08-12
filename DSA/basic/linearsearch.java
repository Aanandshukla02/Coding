public class linearsearch {
    // Method to perform linear search and return the index of the key
    public static int search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found in the array
    }

    public static void main(String[] args) {
        // Array of numbers
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};

        // Key to search for
        int key = 10;

        // Perform linear search
        int res = search(numbers, key);

        // Check the result and print the output
        if (res == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Index of " + key + " is: " + res);
        }
    }
}
