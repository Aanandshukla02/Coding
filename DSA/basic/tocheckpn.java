import java.util.*;

public class tocheckpn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter the number: ");
        int n = s.nextInt();

        // Check if the number is positive or negative
        if (n >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
