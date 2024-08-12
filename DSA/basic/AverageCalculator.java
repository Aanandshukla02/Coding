import java.util.*;

public class AverageCalculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Input three integers from the user
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // Calculate the average of the three integers
        int average = (a + b + c) / 3;

        // Print the average
        System.out.println("Average of " + a + ", " + b + " and " + c + " is: " + average);
    }
}
