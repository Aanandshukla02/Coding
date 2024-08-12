public class subset {
    public static void findsubsets(String str,int i, String ans){
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        findsubsets(str, i+1, ans+str.charAt(i));
        findsubsets(str, i+1, ans);
        
    }
    public static void main(String[] args) {
        String str="ABC";
        findsubsets(str, 0, "");
    }
}