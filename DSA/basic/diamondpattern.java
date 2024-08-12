public class diamondpattern {
    // Method to print diamond pattern based on input 'n'
    public static void diamond(int n) {
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }

        // Lower half of the diamond (excluding the center line)
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }

    // Main method to demonstrate the diamond pattern with n=4
    public static void main(String[] args) {
        diamond(4);
    }
}
