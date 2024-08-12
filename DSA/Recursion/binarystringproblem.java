public class binarystringproblem {
    
    // Method to print binary strings of length n
    public static void printbinstrings(int n, int lastplace, String str) {
        // Base case: if length of string is 0, print the string and return
        if (n == 0) {
            System.out.println(str);
            return;
        }
        
        // Append '0' to the string and recursively call printbinstrings for (n-1) length
        printbinstrings(n - 1, 0, str + "0");
        
        // If the last place in the string is 0, append '1' and recursively call printbinstrings for (n-1) length
        if (lastplace == 0) {
            printbinstrings(n - 1, 1, str + "1");
        }
    }
    
    public static void main(String[] args) {
        // Call printbinstrings with initial parameters to start the process
        printbinstrings(3, 0, "");
    }
}
