import java.util.*;

public class halfpyramid {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Input the number of rows for the half pyramid
        int n = s.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers from 1 to i in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
