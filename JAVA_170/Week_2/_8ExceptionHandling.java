package JAVA_170.Week_2;
// Topics: Try-catch blocks, custom exceptions
// Practice: Write code to handle common exceptions and create custom exception classes
// Assignment: Implement a program that handles file I/O errors.

// Checked Exceptions (Compiletime Exceptions)
// IOException -> FileNotFoundException, EOFException
// SQLException -> SQLIntegrityConstraintViolationException, SQLSyntaxErrorException
// ClassNotFoundException 
// InstantiationException
// InterruptedException
// NoSuchMethodException
// IllegalAccessException


// Unchecked Exception (Runtime Exceptions)
// ArithmeticException
// IndexOutOfBoundsException
// NullPointerException
// ClassCastException
// IllegalArgumentException
// IllegalStateException
// NumberFormatException
// IllegalOutOfBoundsException -> ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException 
// UnsupportedOperationException
// ConcurrentModificationException


// Error
// VirtualMachineError -> InternalError, UnknownError
// OutOfMemoryError
// StackOverflowError

import java.io.*;
public class _8ExceptionHandling {
public static void main(String[] args) {
    Students newStudent = new Students(1, "Suresh",20, "Nepal");
    try {
        String fileLocation = "students.txt";
        // Specify the file name and path
        File file = new File(fileLocation);

        // Create the file
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        FileWriter writer = new FileWriter(fileLocation, true);
        writer.write("Hello ");
        writer.close();

        String read;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
            while((read = reader.readLine()) != null){
                System.out.println(read);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error occurred while reading file");
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}


static class Students{
    int id;
    String name;
    int age;
    String address;
    Students(int id, String name, int age, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;

    }
}


}


