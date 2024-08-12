public class solidrhombos {
    public static void rhombos(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces (n - i) times for indentation
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            
            // Print stars 'n' times to create each row of the rhombus
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Call the rhombos method with n = 7
        rhombos(7);
    }
}
