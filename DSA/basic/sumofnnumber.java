import java.util.*;

public class sumofnnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int s = 0;

        // Loop to calculate the sum of first n natural numbers
        for (int i = 1; i <= n; i++) {
            s += i; // Add each number from 1 to n to the sum
        }

        // Print the result
        System.out.println("The Sum of first " + n + " numbers is: " + s);
    }
}
