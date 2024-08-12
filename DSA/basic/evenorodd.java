import java.util.*;

public class evenorodd {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Input an integer from the user
        int number = sc.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }
    }
}
