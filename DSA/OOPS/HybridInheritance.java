// Interface for basic animal behaviors
interface AnimalBehavior {
    void eat();
    void breathe();
}

// Base class Animal
class Animal implements AnimalBehavior {
    String color;

    public void eat() {
        System.out.println("eats");
    }

    public void breathe() {
        System.out.println("breathes");
    }
}

// Interface for Mammal specific behaviors
interface MammalBehavior {
    void walk();
}

// Interface for Bird specific behaviors
interface BirdBehavior {
    void fly();
}

// Dog class inherits from Animal and implements MammalBehavior
class Dog extends Animal implements MammalBehavior {
    public void walk() {
        System.out.println("walks");
    }
}

// Bat class inherits from Animal and implements both MammalBehavior and BirdBehavior
class Bat extends Animal implements MammalBehavior, BirdBehavior {
    public void walk() {
        System.out.println("walks");
    }

    public void fly() {
        System.out.println("flies");
    }
}

// Main class
public class HybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bat bat = new Bat();
        
        System.out.println("Dog:");
        dog.eat();
        dog.breathe();
        dog.walk();
        
        System.out.println("\nBat:");
        bat.eat();
        bat.breathe();
        bat.walk();
        bat.fly();
    }
}
