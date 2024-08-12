public class tracking {
    // Class declaration for 'tracking'

    // Method to change elements of the array recursively
    public static void changearray(int [] arr, int i, int value) { 
        // If the index 'i' is equal to the length of the array 'arr'
        if(i == arr.length){
            // Print the contents of the array 'arr'
            print(arr);
            // Exit the method
            return;
        }
        // Assign the value 'value' to the element at index 'i' in the array 'arr'
        arr[i] = value;
        // Recursive call to changearray method with updated parameters
        changearray(arr, i + 1, value + 1);
        // Modify the value of the element at index 'i' in the array 'arr' by subtracting 2
        arr[i] = arr[i] - 2;
    } 

    // Method to print the elements of an array
    public static void print(int arr[]) {
        // Loop through each element in the array 'arr'
        for (int i = 0; i < arr.length; i++) {
            // Print the element at index 'i' followed by a space
            System.out.print(arr[i] + " ");
        }
        // Move to the next line after printing all elements of the array
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Declare and initialize an array 'arr' of integers with a length of 5
        int arr[] = new int[5];
        // Call the changearray method to modify the array 'arr' starting from index 0 with value 1
        changearray(arr, 0, 1);
        // Call the print method to display the contents of the modified array 'arr'
        print(arr);
    }
}
