public class searchsortedmatrix { // Declaring a class named searchsortedmatrix
    
    // Method to search for a key in a sorted matrix
    public static boolean search(int matrix[][], int key) { 
        int row = 0; // Initializing row to 0
        int col = matrix[row].length - 1; // Initializing col to the last column index
        
        // Loop until row index is within matrix bounds and col index is non-negative
        while (row < matrix.length && col >= 0) { 
            if (matrix[row][col] == key) { // If the current element equals the key
                System.out.println("found at" + "(" + row + "," + col + ")"); // Print the location where key is found
                return true; // Return true indicating key is found
            } else if (key < matrix[row][col]) { // If key is smaller than the current element
                col--; // Move left in the current row
            } else { // If key is larger than the current element
                row++; // Move down to the next row
            }
        }
        
        System.out.println("key not found "); // If key is not found in the matrix
        return false; // Return false indicating key is not found
    }
    
    public static void main(String[] args) { // Main method
        int[][] matrix = { // Declaring and initializing a sorted matrix
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        
        int key = 33; // Defining the key to be searched
        
        search(matrix, key); // Call the search method to find the key in the matrix
    }
}
