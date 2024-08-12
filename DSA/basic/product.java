import java.util.*;

public class product {

    // Method to calculate the product of two integers
    public static int mul(int x, int y) {
        int product = x * y;
        return product; // Return the calculated product
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        // Call the mul method to calculate the product
        int product = mul(a, b);

        // Print the calculated product
        System.out.println("Product: " + product);
    }
}
