import java.util.*;

public class reversestring {
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>(); 
        int idx=0;
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
            Character current = stack.pop();
            result.append(current);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        String str = "Hello World";
        String result = reverseString(str);
        System.out.println(result);
    }
}
