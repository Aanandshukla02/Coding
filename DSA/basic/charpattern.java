import java.util.*;

public class charpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the value of 'n'
        int n = s.nextInt();

        // Initialize a character variable 'ch' with 'A'
        char ch = 'A';

        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch); // Print the current character
                ch++; // Increment the character for the next iteration
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
