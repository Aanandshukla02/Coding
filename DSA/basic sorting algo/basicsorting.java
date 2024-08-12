public class basicsorting {

    // Method to perform bubble sort on the given array
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for each pass
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop for comparisons in each pass
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    int temp = arr[j]; // Swap if the current element is greater than the next
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform insertion sort on the given array
    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // Start from the second element
            int current = arr[i]; // Store the current element
            int previous = i - 1; // Initialize the index of the previous element
            while (previous >= 0 && arr[previous] > current) { // Shift elements greater than current to the right
                arr[previous + 1] = arr[previous];
                previous--; // Move to the left
            }
            arr[previous + 1] = current; // Insert current element at the correct position
        }
    }

    // Method to perform counting sort on the given array
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE; // Find the largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1]; // Create an array to store the count of each element
        for (int i = 0; i < arr.length; i++) { // Count the occurrences of each element
            count[arr[i]]++;
        }
        int j = 0; // Initialize index for sorted array
        for (int i = 0; i < count.length; i++) { // Traverse count array to update the original array
            while (count[i] > 0) { // If count[i] is greater than 0, update the original array with i
                arr[j] = i;
                j++; // Move to the next index
                count[i]--; // Decrement count
            }
        }
    }

    // Method to perform selection sort on the given array
    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for each pass
            int minpos = i; // Assume the minimum element is at index i
            for (int j = i + 1; j < arr.length; j++) { // Inner loop to find the minimum element
                if (arr[minpos] > arr[j]) { // Compare current element with minpos
                    minpos = j; // Update minpos if current element is smaller
                }
            }
            int temp = arr[minpos]; // Swap the minimum element with the current element
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the elements of the array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Loop through the array elements
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.err.println(); // Move to the next line after printing all elements
    }

    // Main method to test the sorting algorithms
    public static void main(String[] args) {
        int number[] = {5, 4, 1, 3, 2}; // Array of numbers to be sorted
        // Uncomment the desired sorting method below to test
        // bubblesort(number);  // Bubble sort
        // selectionsort(number); // Selection sort
        // insertionsort(number); // Insertion sort
        countingsort(number); // Counting sort
        print(number); // Call the print method to display the sorted array
    }
}
