public class quicksort {
    // Method to print the elements of the array
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Move to the next line after printing all elements
    }
    
    // Method to perform Quick Sort
    public static void Quicksorts(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: if start is greater than or equal to end, return
        }
        int pidx = partition(arr, start, end); // Get the pivot index
        Quicksorts(arr, start, pidx - 1); // Recursively sort the left sub-array
        Quicksorts(arr, pidx + 1, end); // Recursively sort the right sub-array
    }
    
    // Method to partition the array
    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end]; // Choose the last element as pivot
        int i = start - 1; // Index of smaller element
        
        // Iterate through the array
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap arr[i] and pivot (arr[end])
        int temp2 = pivot;
        arr[end] = arr[i];
        arr[i] = temp2;
        
        return i; // Return the partitioning index
    }
    
    // Main method
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5}; // Given array
        Quicksorts(arr, 0, arr.length - 1); // Perform Quick Sort
        printarray(arr); // Print the sorted array
    }
}
