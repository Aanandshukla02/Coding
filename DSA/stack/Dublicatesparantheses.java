import java.util.Stack;

public class  Dublicatesparantheses{
    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
    
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Closing parenthesis
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                s.pop(); // Pop the opening parenthesis
                
                if (count < 1) {
                    return true; // Duplicate
                }
            } else {
                s.push(ch); // Opening parenthesis
            }
        }
        
        return false;
    }
}