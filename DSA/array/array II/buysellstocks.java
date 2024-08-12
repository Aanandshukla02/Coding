public class buysellstocks {

    // Method to calculate maximum profit from buying and selling stocks
    public static int buysell(int prices[]) {
        int buyprice = Integer.MAX_VALUE; // Initialize buy price to the maximum possible value
        int maxprofit = 0; // Initialize maximum profit to 0
        
        // Loop through the array of stock prices
        for (int i = 0; i < prices.length; i++) {
            // Check if the current stock price is lower than the previously recorded buy price
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice; // Calculate profit if sold at current price
                maxprofit = Math.max(maxprofit, profit); // Update maximum profit if current profit is greater
            } else {
                buyprice = prices[i]; // Update buy price if current price is lower or equal
            }
        }
        
        return maxprofit; // Return the maximum profit
    }

    // Main method to test the buysell function
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4}; // Array representing stock prices
        System.out.println(buysell(prices)); // Call buysell method and print the result
    }
}
