import java.util.*;

public class sumofnumber {
    // Method to calculate the sum of two numbers
    public static void calculatesum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Call the calculatesum method and print the result
        calculatesum(a, b);
    }
}
