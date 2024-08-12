import java.util.*;

public class taxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input income from the user
        System.out.print("Enter your income: ");
        int income = sc.nextInt();

        // Calculate tax based on income
        int tax;
        if (income <= 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }

        // Print the calculated tax
        System.out.println("Tax is --> " + tax);
    }
}
