public class sumofn { // Declares a public class named "sumofn"
    public static int sumOfNaturalNumbers(int n) { // Declares a public static method named "sumOfNaturalNumbers" that takes an integer argument "n" and returns an integer
        if (n==1) { // Checks if the value of "n" is equal to 1
            return 1; // Returns 1 if "n" is equal to 1
        }
        int snm1=sumOfNaturalNumbers(n-1); // Declares an integer variable "snm1" and assigns it the result of recursively calling the method "sumOfNaturalNumbers" with argument "n-1"
        int sn=n+snm1; // Declares an integer variable "sn" and assigns it the sum of "n" and "snm1"
        return sn; // Returns the value of "sn"
    }
    public static void main(String[] args) { // Declares a public static method named "main" that takes a String array argument "args" and returns void
        int n=5; // Declares an integer variable "n" and assigns it the value 5
        System.out.print(sumOfNaturalNumbers(n)); // Calls the method "sumOfNaturalNumbers" with argument "n" and prints the result without a newline
    }
}
