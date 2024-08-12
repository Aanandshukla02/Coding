import java.util.*;

public class factorialofn {
    // Method to calculate factorial of a number
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Input an integer from the user
        int a = sc.nextInt();

        // Calculate factorial using the fact method
        int f = fact(a);

        // Print the result
        System.out.println(f);
    }
}
