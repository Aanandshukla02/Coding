public class removeduplicates {
    
    // Method to remove duplicates from the input string
    public static void removeduplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base case: if we have processed the entire string, print the new string and return
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        
        // Get the current character from the input string
        char currchar = str.charAt(idx);
        
        // If the character has already occurred, skip it (duplicate)
        if (map[currchar - 'a'] == true) {
            removeduplicate(str, idx + 1, newStr, map);
        } else {
            // Mark the current character as seen and append it to the new string
            map[currchar - 'a'] = true;
            removeduplicate(str, idx + 1, newStr.append(currchar), map);
        }
    }
    
    public static void main(String[] args) {
        String str = "appnnacollege";
        // Call the removeduplicate method with initial parameters and print the result
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]); // Assuming lowercase English alphabets
    }
}
