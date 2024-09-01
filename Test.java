import java.io.*;
import java.util.Scanner;
public class Test {
	class Person{
        private int age;
        private String name;
    public void setValue(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
		
	}
	public int getAge(){
		return age;
	}
    }
}


class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Person person = new Person();
		person.setValue("Afzal", 67);
		System.out.println("The name of the person is "+person.getName()+" and the age is "+person.getAge());
		
	}
}
