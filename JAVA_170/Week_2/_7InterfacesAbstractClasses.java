package JAVA_170.Week_2;
// Topics: Interfaces, abstract classes
// Practice: Design an interface and implement it in multiple classes
// Assignment: Build an abstract class and its subclasses for different shapes
public class _7InterfacesAbstractClasses{
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.hello();
    }
}
interface speak{
    void hello();
}
class Animal implements speak{
    @Override
    public void hello(){
        System.out.println("Hello, I am an animal");
    }
}