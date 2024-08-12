import java.util.*;

public class invertedhalfpn {
    // Method to generate an inverted half pyramid pattern
    public static void inverted(int n) {
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers in descending order
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Call the inverted method with n=6
        inverted(6);
    }
}
