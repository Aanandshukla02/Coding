import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int yr = sc.nextInt();

        // Check if the year is a leap year
        if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) {
            System.out.println(yr + " is a leap year.");
        } else {
            System.out.println(yr + " is not a leap year.");
        }
    }
}
