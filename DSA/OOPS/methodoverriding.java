public class methodoverriding {

    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats Anythings ");
    }
}
class Deer extends Animal{
   
    void eat(){
        System.out.println("Eats Grass");
    }
}