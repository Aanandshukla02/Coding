public class powerofn {
    // Declaring a class named 'powerofn'

    public static int power(int x, int n) {
        // Declaring a method named 'power' which takes two integers 'x' and 'n' as parameters and returns an integer

        if (n == 0) {
            // If 'n' is equal to 0
            return 1;
            // Return 1, as any number raised to the power of 0 is 1
        }

        return x * power(x, n - 1);
        // Recursively call the 'power' method with 'n - 1' and multiply the result by 'x', effectively calculating 'x' raised to the power of 'n'
    }

    public static void main(String[] args) {
        // Declaring the main method

        System.out.println(power(2, 4)); // prints 16 because 2^4 = 16
        // Calling the 'power' method with 'x = 2' and 'n = 4', then printing the result
    }
}
