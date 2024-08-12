import java.util.*;

public class addtax {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the amounts of three items
        System.out.print("Enter the amount of 1 item:");
        float a = s.nextFloat();

        System.out.print("Enter the amount of 2 item:");
        float b = s.nextFloat();

        System.out.print("Enter the amount of 3 item:");
        float c = s.nextFloat();

        // Calculate total cost without taxes
        float total = a + b + c;

        // Calculate total cost with 18% taxes
        float tax = (total * 0.18f) + total;

        // Print the total cost including taxes
        System.out.println("Total cost with 18% taxes: " + tax);
    }
}
