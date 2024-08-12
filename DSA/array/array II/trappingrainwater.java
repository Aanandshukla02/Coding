public class trappingrainwater {

    // Function to calculate trapped rainwater
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        // Calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        // Calculate the maximum height to the left of each bar
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];

        // Calculate the maximum height to the right of each bar
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // Loop to calculate trapped water at each position
        int trappedwater = 0;

        // Water level = min(leftmax bound, rightmax bound)
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // Trapped water = waterlevel - height[i]
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        // Calculate and print the trapped rainwater
        System.out.println(trappedRainwater(height));
    }

}
