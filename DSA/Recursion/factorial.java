// Defining a class named "factorial"
public class factorial {
    
    // Defining a method named "factorial" which takes an integer "number" as input
    public static int factorials(int number) {
        // Base case: if the input number is 0, return 1
        if (number == 0) {
            return 1;
        }
        
        // Recursive call: calling the factorial method with (number - 1) as input
        int fnum1 = factorials(number - 1);
        
        // Calculating the factorial of the current number by multiplying it with the result of the previous factorial
        int fn = number * fnum1;
        
        // Returning the factorial of the current number
        return fn;
    }
    
    // Main method where the program starts execution
    public static void main(String[] args) {
        // Initializing a variable "n" with the value 5
        int n = 5;
        
        // Printing the factorial of "n" by calling the factorial method and passing "n" as input
        System.out.println(factorials(n));
    }
}
