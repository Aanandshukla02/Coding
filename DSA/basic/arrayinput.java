import java.util.*;

public class arrayinput {
    public static void main(String[] args) {
        int marks[] = new int[5]; // Create an array to store 5 numbers
        Scanner sc = new Scanner(System.in);

        // Input five numbers from the user and store them in the array
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        // Print the numbers from the array
        for (int i = 0; i < 5; i++) {
            System.out.println("Number is ---> " + marks[i]);
        }
    }
}
