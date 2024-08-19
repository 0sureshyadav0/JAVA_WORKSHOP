package JAVA_170.Week_2;

// Topics: Inheritance, method overriding, polymorphism
// Practice: Implement a class hierarchy for different types of vehicles
// Assignment: Create a program demonstrating method overriding and polymorphism
public class _6InheritancePolymorphism {

    public _6InheritancePolymorphism() {
        System.out.println("Hello");
    }
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        sum(5,4);
        sum(1,4,7);

    }
}

class Hello extends _6InheritancePolymorphism {
    Hello() {
        super();
    }
}