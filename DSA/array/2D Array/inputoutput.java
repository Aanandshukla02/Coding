import java.util.Scanner; // Importing the Scanner class from java.util package for user input

public class inputoutput { // Declaring a class named inputoutput
    
    // Method to search for a key in a 2D matrix
    public static boolean search(int[][] matrix, int key) { 
        for (int i = 0; i < matrix.length; i++) { // Loop through the rows of the matrix
            for (int j = 0; j < matrix[0].length; j++) { // Loop through the columns of the matrix
                if (matrix[i][j] == key) { // If the current cell matches the key
                    System.out.println("Found at cell (" + i + "," + j + ")"); // Print the location where key is found
                    return true; // Return true indicating key is found
                }
            }
        }
        System.out.println("Key not found"); // If key is not found in the matrix
        return false; // Return false indicating key is not found
    }
    
    public static void main(String[] args) { // Main method
        int[][] matrix = new int[3][3]; // Declaring and initializing a 3x3 matrix
        
        int n = matrix.length; // Storing the number of rows of the matrix
        
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        
        System.out.println("Enter elements of the matrix (3x3):");
        
        // Loop to take input for each cell of the matrix
        for (int i = 0; i < n; i++) { // Loop through the rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through the columns
                matrix[i][j] = sc.nextInt(); // Read an integer from the user and store it in the current cell
            }
        }
        
        // Output the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) { // Loop through the rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through the columns
                System.out.print(matrix[i][j] + " "); // Print the value of the current cell followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        search(matrix, 5); // Call the search method to find the key '5' in the matrix
    }
}
