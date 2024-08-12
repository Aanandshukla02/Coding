public class hollowrhombos {
    // Method to generate a hollow rhombus pattern
    public static void hallow(int n) {
        for (int i = 1; i <= n; i++) {
            // Loop to print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Loop to print asterisks and spaces
            for (int j = 1; j <= n; j++) {
                // Check if the current position is on the boundary
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        // Call the hallow method with n=5
        hallow(5);
    }
}
