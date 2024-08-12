import java.util.*;

public class fever {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.println("Enter the temperature:");

        // Input the temperature from the user
        double temp = sc.nextDouble();

        // Check if the temperature is greater than 100
        if (temp > 100) {
            System.out.println("You have a fever!");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}
