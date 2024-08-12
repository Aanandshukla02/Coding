import java.util.*;

public class arraycc {
    // Function to update each element of the array by 1
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        // Initialize an array of marks
        int marks[] = {97, 98, 99};

        // Call the update method to increment each element of the array by 1
        update(marks);

        // Print the updated marks array
        // Note: In the updated array, each element is increased by 1
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
