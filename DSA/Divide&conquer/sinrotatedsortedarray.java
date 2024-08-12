public class sinrotatedsortedarray {
    // Method to search for a target element in a rotated sorted array
    public static int search(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1; // If start index exceeds end index, return -1 (target not found)
        }
        int mid = start + (end - start) / 2; // Calculate mid index
        if (arr[mid] == target) return mid; // If target found at mid index, return mid
        
        // Check if left side is sorted
        else if (arr[start] <= arr[mid]) {  
            // If target lies in the left subarray
            if (arr[start] <= target && target < arr[mid])   
                return search(arr, target, start, mid - 1); // Recursively search in the left subarray
            else
                return search(arr, target, mid + 1, end);   // Recursively search in the right subarray
        } else { // Right side is sorted
            // If target lies in the right subarray
            if (arr[mid] < target && target <= arr[end])
                return search(arr, target, mid + 1, end);   // Recursively search in the right subarray
            else
                return search(arr, target, start, mid - 1); // Recursively search in the left subarray
        }
    }
    
    // Main method
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2}; // Given rotated sorted array
        int target = 0; // Target element to search
        int taridx = search(arr, target, 0, arr.length - 1); // Search for target element
        System.out.println(taridx); // Print index of target element
    }
}
