package JAVA_170.Week_1;
// Topics: Classes, objects, constructors
// Practice: Design a class for a simple bank account system
// Assignment: Create a class to manage student records with attributes and methods
public class _5OOPBasics {

    public static void main(String[] args) {
        Student newStudent = new Student("Suresh",20,"Nepal");
    }
    public static class Student{
        String name;
        int age;
        String address;
        public Student(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String getName(){
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
    }
}
