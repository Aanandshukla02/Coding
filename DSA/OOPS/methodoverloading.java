public class methodoverloading {
   public static void main(String[] args) {
    Calculator calc=new Calculator();
    System.out.println(calc.sum(1, 2));
    System.out.println(calc.sum((float)1.5,(float)2.5));
    System.out.println(calc.sum(1, 2, 3));
   } 
}
 class Calculator {

    int sum(int a, int b) {
        // This method adds two integers and returns the sum
        return a + b;
    }

    float sum(float a, float b) {
        // This method adds two floats and returns the sum
        return a + b;
    }

    int sum(int a, int b, int c) {
        // This method adds three integers and returns the sum
        return a + b + c;
    }
}
