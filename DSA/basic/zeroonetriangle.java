
public class zeroonetriangle {
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Check if the sum of row number (i) and column number (j) is even
                if (((i + j) % 2) == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(5);
    }
}
