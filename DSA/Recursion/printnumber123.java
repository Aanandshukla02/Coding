// Importing a package to use Scanner and other utilities
import java.util.*;

// Defining a class named "printnumber123"
public class printnumber123 {

    // Defining a method named "print" which takes an integer "num" as input
    public static void print(int num) {
        // Base case: if the input number is 1, print it and return
        if (num == 1) {
            System.out.print("1" + " ");
            return;
        }
        
        // Recursive call: calling the print method with (num - 1) as input
        print(num - 1);
        
        // Print the current number followed by a space
        System.out.print(num + " ");
    }
    
    // Main method where the program starts execution
    public static void main(String[] args) {
        // Creating a Scanner object named "sc" to take user input from the console
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter an integer and storing it in variable "n"
        int n = sc.nextInt();
        
        // Calling the "print" method with input "n"
        print(n);
    }
}
