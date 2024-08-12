public class optimizepon {
    // Declaring a class named 'optimizepon'

    public static int optimizepons(int a, int n) {
        // Declaring a method named 'optimizepons' which takes two integers 'a' and 'n' as parameters and returns an integer

        if (n == 0) {
            // If 'n' is equal to 0
            return 1;
            // Return 1, as any number raised to the power of 0 is 1
        }

        int halfpowsq = optimizepons(a, n / 2) * optimizepons(a, n / 2);
        // Calculating the square of the result of 'optimizepons(a, n/2)', effectively calculating 'a' raised to the power of 'n/2'

        // If 'n' is odd
        if (n % 2 != 0) {
            halfpowsq = a * halfpowsq;
            // Multiply 'halfpowsq' by 'a' to handle the odd power case
        }

        return halfpowsq;
        // Return the result
    }

    public static void main(String[] args) {
        // Declaring the main method

        int a = 2;
        // Declaring and initializing an integer variable 'a' with value 2
        int n = 10;
        // Declaring and initializing an integer variable 'n' with value 10

        System.out.println("The value of a^" + n + " = " + optimizepons(a, n));
        // Calling the 'optimizepons' method with 'a' and 'n', then printing the result
    }
}
