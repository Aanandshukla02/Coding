public class firstoccurrence {
    // Declaring a class named 'firstoccurrence'
    
    public static int firstoccurrences(int[] arr, int key, int i) {
        // Declaring a method named 'firstoccurrences' which takes an integer array 'arr', an integer 'key', and an integer 'i' as parameters and returns an integer
        
        if (i == arr.length) {
            // If 'i' is equal to the length of the array 'arr'
            return -1;
            // Return -1 indicating that the key was not found in the array
        }
        
        if (arr[i] == key) {
            // If the element at index 'i' of the array 'arr' is equal to the 'key'
            return i;
            // Return the index 'i' indicating the first occurrence of the key in the array
        }
        
        return firstoccurrences(arr, key, i + 1);
        // Recursively call the 'firstoccurrences' method with the next index 'i + 1'
    }

    public static void main(String[] args) {
        // Declaring the main method
        
        int[] arr = {2, 4, 6, 2, 9, 4, 5, 3};
        // Declaring and initializing an integer array 'arr' with values 2, 4, 6, 2, 9, 4, 5, and 3
        
        System.out.println("First occurrence of 2 is at index " + firstoccurrences(arr, 2, 0));
        // Calling the 'firstoccurrences' method with the array 'arr', key '2', and starting index '0', then printing the result along with the string "First occurrence of 2 is at index "
    }
}
