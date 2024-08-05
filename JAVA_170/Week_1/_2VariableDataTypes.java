package JAVA_170.Week_1;
// Topics: Primitive data types, variables, operators
// Practice: Create programs to perform arithmetic operations and type conversions
// Assignment: Write a program that calculates the area and perimeter of different shapes.

// byte:
// Size: 8 bits
// Range: -128 to 127
// Example: byte age = 25;

// short:
// Size: 16 bits
// Range: -32,768 to 32,767
// Example: short year = 2024;

// int:
// Size: 32 bits
// Range: -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647)
// Example: int population = 100000;

// long:
// Size: 64 bits
// Range: -2^63 to 2^63-1 (-9,223,372,036,854,784 to 9,223,372,036,854,775,807)
// Example: long distance = 1234567890123L;

// float:
// Size: 32 bits
// Range: Approximately ±3.40282347E+38F (up to 7 decimal digits of precision)
// Example: float temperature = 36.6f;

// double:
// Size: 64 bits
// Range: Approximately ±1.79769313486231570E+308 (up to 15 decimal digits of precision)
// Example: double pi = 3.141592653589793;

// char:
// Size: 16 bits
// Range: 0 to 65,535 (represents a single 16-bit Unicode character)
// Example: char initial = 'A';

// boolean:
// Size: Not precisely defined (implementation-dependent, but typically 1 bit or 1 byte)
// Values: true or false
// Example: boolean isActive = true;



public class _2VariableDataTypes {
   public static void main(String[] args) {
    byte a =1;
    short b =2;
    int c =3;
    double d =4;
    float e =5;
    char f =6;
    long g =7;

    // Wrapper class
    System.out.println(Byte.SIZE);
    System.out.println(Short.SIZE);
    System.out.println(Integer.SIZE);
    System.out.println(Double.SIZE);
    System.out.println(Float.SIZE);
    System.out.println(Character.SIZE);
    System.out.println(Long.SIZE);

   }
}
