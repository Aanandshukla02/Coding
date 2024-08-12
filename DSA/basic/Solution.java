public class Solution {
    public static void find(int number[], int target) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    System.out.println("Indices: " + i + " " + j);
                    System.out.println("Values: " + number[i] + " " + number[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 7, 11, 15};
        int target = 9;
        find(number, target);
    }
}
