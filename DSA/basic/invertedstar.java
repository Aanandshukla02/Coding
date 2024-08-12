import java.util.*;

public class invertedstar {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Input the number of rows for the inverted pyramid
        int n = s.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Loop to print asterisks in descending order
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
