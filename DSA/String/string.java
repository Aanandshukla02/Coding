// import java.util.*;
public class string {
    public static void printname(String str ) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[]={'A','N','A','N','D'};
        // String str ="ANAND1";
        // String str2 = new String("ANAND2");

        // //Strings are IMMUTABLE

        // String name;
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter your Name: ");
        // name =sc.nextLine();
        // System.out.println("Your name is "+ name);

        //  String fullname="Anand shukla";
        // System.out.println(fullname.length());

        // concatenation
        String firstname="Anand";
        String lastname="shukla";
        String fullname=firstname + " " +lastname ; 
        System.out.println("Full Name :"+fullname );

        printname(fullname);
       
        
        
    }
}
    
