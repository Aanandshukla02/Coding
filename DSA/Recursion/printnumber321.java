// Importing a package to use Scanner and other utilities
import java.util.*;

// Defining a class named "printnumber321"
public class printnumber321 {

    // Defining a method named "print" which takes an integer "n" as input
    public static void print(int n) {
        // Base case: if the input number is 1, print it and return
        if (n == 1) {
            System.out.println(n);
            return;
        }
        
        // Print the current number and a space
        System.out.println(n + " ");
        
        // Recursive call: calling the print method with (n - 1) as input
        print(n - 1);
    }
    
    // Main method where the program starts execution
   
    public static void main(String[] args) {
        // Creating a Scanner object named "sc" to take user input from the console
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter an integer and storing it in variable "num"
        int num = sc.nextInt();
        
        // Calling the "print" method with (num - 1) as input
        print(num - 1);
    }
}
