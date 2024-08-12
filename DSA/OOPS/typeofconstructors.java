public class typeofconstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shradha");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;

    // Default constructor
    Student() {
        System.out.println("Default constructor is called...");
    }

    // Constructor with a String parameter
    Student(String name) {
        this.name = name;
        System.out.println("Constructor with name: " + name);
    }

    // Constructor with an int parameter
    Student(int roll) {
        this.roll = roll;
        System.out.println("Constructor with roll number: " + roll);
    }
}
