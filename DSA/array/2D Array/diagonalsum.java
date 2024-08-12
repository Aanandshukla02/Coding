public class diagonalsum { // Declaring a class named diagonalsum
    
    // Method to calculate the sum of the diagonals of a matrix
    public static int diagonalsums(int matrix[][]) { 
        int sum = 0; // Initializing the sum variable to 0
        
        // Loop through the rows of the matrix
        for (int i = 0; i < matrix.length; i++) { 
            // Loop through the columns of the matrix
            for (int j = 0; j < matrix[0].length; j++) { 
                if (i == j) { // If the current element is on the primary diagonal (i == j)
                    sum += matrix[i][j]; // Add the element to the sum
                } else if (i + j == matrix.length - 1) { // If the current element is on the non-primary diagonal (i + j == n - 1)
                    sum += matrix[i][j]; // Add the element to the sum
                }
            }
        }
        return sum; // Return the sum of the diagonals
    }
    
    public static void main(String[] args) { // Main method
        int matrix[][] = { // Declaring and initializing a 4x4 matrix
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println(diagonalsums(matrix)); // Print the sum of the diagonals of the matrix
    }
}

// public class diagonalsum { // Declaring a class named diagonalsum
    
//     // Method to calculate the sum of the diagonals of a matrix
//     public static int diagonalsums(int matrix[][]) { 
//         int sum = 0; // Initializing the sum variable to 0
        
//         // Loop through the rows of the matrix
//         for (int i = 0; i < matrix.length; i++) { 
//             //pd (primary diagonal)
//             sum += matrix[i][i]; // Add the element at position (i, i) to the sum
            
//             //npd (non-primary diagonal)
//             if (i != matrix.length - 1 - i) { // If the element is not on the primary diagonal (i != j)
//                 sum += matrix[i][matrix.length - i - 1]; // Add the element at position (i, n-i-1) to the sum
//             }
//         }
//         return sum; // Return the sum of the diagonals
//     }
    
//     public static void main(String[] args) { // Main method
//         int matrix[][] = { // Declaring and initializing a 4x4 matrix
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
        
//         System.out.println(diagonalsums(matrix)); // Print the sum of the diagonals of the matrix
//     }
// }
