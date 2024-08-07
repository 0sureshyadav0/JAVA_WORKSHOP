package JAVA_170.Week_2;

// Topics: Inheritance, method overriding, polymorphism
// Practice: Implement a class hierarchy for different types of vehicles
// Assignment: Create a program demonstrating method overriding and polymorphism
public class _6InheritancePolymorphism {

    public _6InheritancePolymorphism() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
    }
}

class Hello extends _6InheritancePolymorphism {
    Hello() {
        super();
    
    }
}