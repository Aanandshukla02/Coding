public class spiralmatrix { // Declaring a class named spiralmatrix
    
    // Method to print a matrix in spiral order
    public static void printspiral(int matrix[][]) { 
        int startrow = 0; // Initializing the starting row index
        int startcol = 0; // Initializing the starting column index
        int endrow = matrix.length - 1; // Initializing the ending row index
        int endcol = matrix[0].length - 1; // Initializing the ending column index

        // Loop until the indices define a valid sub-matrix
        while (startrow <= endrow && startcol <= endcol) { 
            // Print top row from left to right
            for (int j = startcol; j <= endcol; j++) { 
                System.out.print(matrix[startrow][j] + " ");
            }
            // Print right column from top to bottom
            for (int i = startrow + 1; i <= endrow; i++) { 
                System.out.print(matrix[i][endcol] + " ");
            }
            // Print bottom row from right to left (if applicable)
            for (int j = endcol - 1; j >= startcol; j--) { 
                if (startrow == endrow) { // Check if it's the last row
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // Print left column from bottom to top (if applicable)
            for (int i = endrow - 1; i >= startrow + 1; i--) { 
                if (startcol == endcol) { // Check if it's the last column
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }

            // Update indices for the next iteration
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println(); // Move to the next line after printing the spiral
    }
    
    public static void main(String[] args) { // Main method
        int matrix[][] = { // Declaring and initializing a 4x4 matrix
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        printspiral(matrix); // Call the printspiral method to print the matrix in spiral order
    }
}
