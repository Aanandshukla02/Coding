import java.util.*;

public class week {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input a number representing a day from the user
        System.out.print("Enter the number for day: ");
        int temp = s.nextInt();

        // Use a switch statement to determine the day based on the input number
        switch (temp) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // If the input is not 1-7, you can handle it here (optional)
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }
    }
}
