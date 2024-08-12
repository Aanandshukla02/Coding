import java.util.*;

public class areaofsquare {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the lengths of the sides
        System.out.println("Enter the 1st side = ");
        int a = s.nextInt();

        System.out.println("Enter the 2nd side = ");
        int b = s.nextInt();

        // Calculate the area of the square (assuming the sides represent the length and breadth)
        int area = a * b;

        // Print the calculated area
        System.out.println("Area of square --> " + area);
    }
}
