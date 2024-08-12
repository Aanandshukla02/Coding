public class fabonaccinumber { // Declares a public class named "fabonaccinumber"
    public static int fibonacciNumber(int number) { // Declares a public static method named "fibonacciNumber" that takes an integer argument "number" and returns an integer
        if (number ==0 || number==1) { // Checks if the value of "number" is equal to 0 or 1
            return number; // Returns the value of "number" if it's equal to 0 or 1
        }
        int fibonacciNumbern1=fibonacciNumber(number-1); // Declares an integer variable "fibonacciNumbern1" and assigns it the result of recursively calling the method "fibonacciNumber" with argument "number-1"
        int fibonacciNumbern2 = fibonacciNumber(number-2); // Declares an integer variable "fibonacciNumbern2" and assigns it the result of recursively calling the method "fibonacciNumber" with argument "number-2"
        return fibonacciNumbern1 + fibonacciNumbern2; // Returns the sum of "fibonacciNumbern1" and "fibonacciNumbern2"
    }
    public static void main(String[] args) { // Declares a public static method named "main" that takes a String array argument "args" and returns void
        int n = 23; // Declares an integer variable "n" and assigns it the value 23
        System.out.println(fibonacciNumber(n)); // Calls the method "fibonacciNumber" with argument "n" and prints the result followed by a newline
    }
}
