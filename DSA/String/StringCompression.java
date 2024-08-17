/* public class SringCompression {
    public static String Compress(String str){
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if (count>1) {
                newstr+=count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(Compress(str));
    }
} */
public class StringCompression {
    public static String compress(String str) {
        StringBuilder newstr = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            
            // Count the occurrences of the same character
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            
            // Append the character
            newstr.append(str.charAt(i));
            
            // Append the count if it's greater than 1
            if (count > 1) {
                newstr.append(count);
            }
        }
        
        return newstr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));  // Output: a3b2c3d2
    }
}