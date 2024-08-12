public class tiling {

    // Method to calculate the number of ways to tile a floor of size n
    public static int tilingproblem(int n) {
        // Base cases: if floor size is 0 or 1, there is only 1 way to tile it
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Recursively calculate the number of ways to tile for n-1 and n-2
        int fnm1 = tilingproblem(n - 1); // Number of ways to tile for (n-1) size floor
        int fnm2 = tilingproblem(n - 2); // Number of ways to tile for (n-2) size floor
        
        // Total ways to tile the floor of size n is the sum of ways for (n-1) and (n-2) size floors
        int totalways = fnm1 + fnm2;
        
        return totalways;
    }
    
    public static void main(String[] args) {
        // Call the tilingproblem method with floor size 3 and print the result
        System.out.println(tilingproblem(3)); 
    }
}
