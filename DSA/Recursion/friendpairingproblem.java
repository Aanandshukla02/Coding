public class friendpairingproblem {
    
    // Method to calculate the number of ways to pair friends
    public static int friendpairing(int n) {
        // Base cases: if there is only 1 friend or 2 friends, there's only 1 way to pair them
        if (n == 1 || n == 2) {
            return n;
        }
        
        // Recursively calculate the number of ways to pair for (n-1) and (n-2) friends
        int fnm1 = friendpairing(n - 1); // Number of ways to pair for (n-1) friends
        int fnm2 = friendpairing(n - 2); // Number of ways to pair for (n-2) friends
        
        // Number of ways to pair when the current friend is paired with someone
        int pairways = (n - 1) * fnm2;
        
        // Total ways to pair friends is the sum of ways when the current friend is single and paired
        int totalways = fnm1 + pairways;
        
        return totalways;
    }
    
    public static void main(String[] args) {
        // Call the friendpairing method with 3 friends and print the result
        System.out.println(friendpairing(3));
    }
}
