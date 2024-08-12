public class question1 {
    public static void oddeven(int n) {
        int bitmask=1;
        if ((n&bitmask)==0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {
        oddeven(3);
        oddeven(6);
        oddeven(4);
    }
}
