package JAVA_170.Week_1;
import java.util.Scanner;
// Topic: if-else, switch-case, loops(for, while, do-while)
// Practice: Implement control flow in a number guessing game
// Assignment: 
// 4. Implement a program that prints the numbers from 1 to 100 using a for loop. Modify the program to print only even numbers.
// 5. Write a Java program using a while loop to calculate the factorial of a given number.
// 6. Create a do-while loop that continues to prompt the user for input until they enter a valid integer.
// 7. Develop a Java program that uses the break statement to exit from a loop when a specific condition is met.
// 8. Write a program that uses the continue statement to skip over odd numbers in a loop and print only even numbers.
public class _3ControlFlow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or composite");
        int number = input.nextInt();
        boolean result = checkPrime(number);
        System.out.println(result);
        String output = checkPositiveNegative(number);
        System.out.println(output);
        System.out.println(day(number));
    }

// 1. Write a program that checks if a number is prime or composite
    public static boolean checkPrime(int number){
        int count=0;
        for(int i=1; i<=number; i++){
            if(number % i ==0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
       return false;
    }

// 2. Write a Java program that uses if, else if, and else statements to determine if a number is positive, negative, or zero.
    public static String checkPositiveNegative(int number){
        if(number <0)
        {
            return "Negative";
        }
        else if(number > 0)
        {
            return "Positive";
        }
        else
            return "Zero";
    }

// 3. Create a switch statement that prints the name of the day based on an integer input (1 for Monday, 2 for Tuesday, etc.).
    public static String day(int number){
    
        switch(number){
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
        }
        return "Invalid";
    }
}
