public class lastoccurrance {
    // Declaring a class named 'lastoccurrance'

    public static int lastOccurrance(int[] arr, int key, int i) {
        // Declaring a method named 'lastOccurrance' which takes an integer array 'arr', an integer 'key', and an integer 'i' as parameters and returns an integer

        if (i == arr.length) {
            // If 'i' is equal to the length of the array 'arr'
            return -1;
            // Return -1 indicating that the key was not found in the array
        }

        int isfound = lastOccurrance(arr, key, i + 1);
        // Recursively call the 'lastOccurrance' method with the next index 'i + 1' and store the result in 'isfound'

        if (isfound == -1 && arr[i] == key) {
            // If 'isfound' is -1 (indicating the key was not found in the rest of the array) and the element at index 'i' of the array 'arr' is equal to the 'key'
            return i;
            // Return the index 'i' indicating the last occurrence of the key in the array
        }

        return isfound;
        // Return 'isfound' which holds the index of the last occurrence of the key in the array
    }

    public static void main(String[] args) {
        // Declaring the main method

        int arr[] = {1, 3, 3, 4, 5};
        // Declaring and initializing an integer array 'arr' with values 1, 3, 3, 4, and 5
        int key = 3;
        // Declaring and initializing an integer variable 'key' with value 3

        System.out.println("Last Occurrence of element in the array is : " + lastOccurrance(arr, key, 0));
        // Calling the 'lastOccurrance' method with the array 'arr', key '3', and starting index '0', then printing the result along with the string "Last Occurrence of element in the array is : "
    }
}
