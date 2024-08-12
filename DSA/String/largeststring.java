public class largeststring {
    public static void main(String[] args) {
        String str[] = {"apple","mango","banana"};
        String largest = str[0]; // assume the first string is the largest one.
        
        for (int i=1;i<str.length;i++) {
            if (largest.compareTo(str[i]) < 0) { 
                largest = str[i]; 
            }
        }
        System.out.println("The largest string is " + largest);
    }
}
    
