public class binarysearch {
    // Function to perform binary search on a sorted array
    public static int search(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        // Binary search loop
        while (start <= end) {
            int mid = (start + end) / 2;

            // Check if the key is at the middle position
            if (number[mid] == key) {
                return mid;
            } else if (number[mid] < key) {
                // If key is greater, search in the right half
                start = mid + 1;
            } else {
                // If key is smaller, search in the left half
                end = mid - 1;
            }
        }

        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        // Perform binary search and print the index of the key
        System.out.println("Index for key is --> " + search(number, key));
    }
}
