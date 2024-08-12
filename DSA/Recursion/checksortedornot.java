public class checksortedornot {
    // Declaring a class named 'checksortedornot'
    
    public static boolean issorted(int arr[], int i) {
        // Declaring a method named 'issorted' which takes an integer array 'arr' and an integer 'i' as parameters and returns a boolean value
        
        if (i == arr.length - 1) {
            // If 'i' is equal to the last index of the array 'arr'
            return true;
            // Return true indicating that the array is sorted
        }
        
        if (arr[i] > arr[i + 1]) {
            // If the element at index 'i' of the array 'arr' is greater than the element at the next index 'i + 1'
            return false;
            // Return false indicating that the array is not sorted
        }
        
        return issorted(arr, i + 1);
        // Recursively call the 'issorted' method with the next index 'i + 1'
    }

    public static void main(String[] args) {
        // Declaring the main method
        
        int arr[] = { 1, 2, 3, 4, 5 };
        // Declaring and initializing an integer array 'arr' with values 1, 2, 3, 4, and 5
        
        System.out.println("Is the array sorted? " + issorted(arr, 0));
        // Calling the 'issorted' method with the array 'arr' and starting index '0', then printing the result along with the string "Is the array sorted?"
    }
}
