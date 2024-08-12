import java.util.*;

public class rotatedhalfpyramid {

    // Method to print a rotated half pyramid of stars
    public static void inverted(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces (n - i) times
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print stars i times
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Call the inverted method with n = 5
        inverted(5);
    }
}
