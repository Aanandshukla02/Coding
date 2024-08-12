public class substring {
    public static String sub(String str, int start,int end) {
        String substr="";
        for (int i = start; i < end; i++) {
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(sub(str,2,5)); //prints HloW
        // System.out.println(sub(str,0,5)); // Output: lloW
        
    }
}
