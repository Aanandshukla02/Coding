public class RainWaterProblem {

    static int findWater(int[] arr) {
        int arr_size = arr.length;

        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int left[] = new int[arr_size];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int right[] = new int[arr_size];

        // Initialize result
        int water = 0;

        // Precompute left array
        left[0] = arr[0];
        for (int i = 1; i < arr_size; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        // Precompute right array
        right[arr_size - 1] = arr[arr_size - 1];
        for (int i = arr_size - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the amount of water
        // accumulated on this particular bar will be equal to min(left[i], right[i]) - arr[i];
        for (int i = 0; i < arr_size; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Maximum water that can be accumulated is " + findWater(arr));
    }
}
