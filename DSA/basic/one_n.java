import java.util.*;

public class one_n {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number (n): ");
        
        // Read the input integer n
        int n = s.nextInt();

        // Initialize a counter variable i to 1
        int i = 1;

        // Use a while loop to print numbers from 1 to n
        while (i <= n) {
            System.out.println(i);
            i++; // Increment the counter variable
        }
    }
}
