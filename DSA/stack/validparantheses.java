import java.util.*; // Importing the java.util package to use utility classes like Stack

public class validparantheses { // Declaring a class named validparantheses

    public static boolean isValid(String str) { // Declaring a method named isValid which takes a String str as argument and returns a boolean value
        Stack<Character> s = new Stack<>(); // Creating a stack to store characters
        for (int i = 0; i < str.length(); i++) { // Starting a loop to iterate through each character of the input string
            char ch = str.charAt(i); // Getting the character at index i from the input string
            if (ch == '(' || ch == '{' || ch == '[') { // Checking if the character is an opening parenthesis
                s.push(ch); // Pushing the opening parenthesis onto the stack
            } else { // If the character is not an opening parenthesis, it must be a closing parenthesis
                if (s.isEmpty()) { // If the stack is empty, there's no matching opening parenthesis, so the string is invalid
                    return false; // Returning false
                }
                // Checking if the current closing parenthesis matches the top opening parenthesis on the stack
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                    s.pop(); // If matched, pop the top opening parenthesis from the stack
                } else { // If the current closing parenthesis does not match the top opening parenthesis
                    return false; // Return false as the string is invalid
                }
            }
        }
        if (s.isEmpty()) { // If the stack is empty after processing all characters, it means all opening parentheses have been matched
            return true; // Return true as the string is valid
        } else {
            return false; // If the stack is not empty, there are unmatched opening parentheses, so the string is invalid
        }
    }

    public static void main(String[] args) { // Declaring the main method
        String str = "((){})[]"; // Declaring and initializing a string variable named str
        System.err.println(isValid(str)); // Calling the isValid method with str as argument and printing its return value
    }
}
