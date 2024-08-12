public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Fish fish = new Fish();
        Bird bird = new Bird();
        
        System.out.println("Mammal:");
        mammal.eat();
        mammal.breathe();
        mammal.walk();
        
        System.out.println("\nFish:");
        fish.eat();
        fish.breathe();
        fish.swim();
        
        System.out.println("\nBird:");
        bird.eat();
        bird.breathe();
        bird.fly();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies"); // Corrected the typo
    }
}
