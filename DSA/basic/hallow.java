import java.util.*;

public class hallow {

    // Method to generate a hollow rectangle pattern
    public static void hallow_rectagle(int Row, int Colm) {
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= Colm; j++) {
                // Check if the current position is on the boundary
                if (i == 1 || i == Row || j == 1 || j == Colm) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Call the hallow_rectagle method with Row=4 and Colm=3
        hallow_rectagle(4, 3);
    }
}
