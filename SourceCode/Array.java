package SourceCode;
// import java.util.Scanner;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        String[] planets = new String[8];
        planets[0] = "Mercury";
        planets[1] = "Venus";
        planets[2] = "Earth";
        planets[3] = "Mars";
        // planets[4] = "Jupiter";
        // planets[5] = "Saturn";
        // planets[6] = "Neptune";
        // planets[7] = "Uranus";

        Integer[] numbers = new Integer[10];
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 6;
        numbers[3] = 3;
        numbers[4] = 5;
        numbers[5] = 9;
        numbers[6] = 10;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 3;

        // String insertedText;
        // int position;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the text to insert:");
        // insertedText = input.nextLine();
        // System.out.println("Enter position to enter text:");
        // position = input.nextInt();

        // Inserting at beginning
        // for (int i = planets.length - 1; i > 0; i--) {
        // planets[i] = planets[i - 1];
        // }
        // planets[0] = "Uranus";

        // Inserting at index position
        // for (int i = planets.length-1; i >position-1; i--) {
        // planets[i]=planets[i-1];

        // }
        // planets[position-1]=insertedText;

        // Deletion at index position
        // for(int i=position-1; i<planets.length-1; i++){
        // planets[i] = planets[i+1];
        // }

        // Sorting in ascending
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }

        // Removing duplicates
        // Not working
        // int count = 0;
        // for (int i = 0; i < numbers.length-1; i++) {
        //    System.out.println("Outer loop runs: "+count++);
                // if (numbers[i] == numbers[i+1]) {

                //    for(int j=i; j<numbers.length-1; j++){
                    // System.out.println("Before " + numbers[j]+ " at index "+j);
                    //         numbers[j] = numbers[j+1];
                    // System.out.println("After " + numbers[j]+ " at index " +(j));
                    // System.out.println(numbers[j]);
                //    }
                // }
            
        // }
        // numbers[numbers.length-1] = null;


        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i] + " ");
        // }
        // Printing the values
        // for (int i = 0; i < planets.length; i++) {
        // System.out.print(planets[i] + " ");
        // }


        // Dynamic Array 
        List<String> planet = new ArrayList<>();
        planet.add("Mercury");
        planet.add("Venus");
        planet.add("Earth");
        planet.add("Mars");
        planet.add("Jupitar");
        planet.add("Saturn");
        System.out.println(planet);

        // Insertion at beginning 
        planet.add(0,"Suresh");
        
        // Deletion 
        planet.remove(3);









    }
    
    // Implementation of dynamic array it means how dynamic array works 

    public class DynamicArray{
        private int[] array;
        private int size;
        private int capacity;


        // Constructs a new dynamic array with the given initial capacity 
        public DynamicArray(int capacity){
            this.array = new int[capacity];
            this.size = 0;
            this.capacity = capacity;
        }

        // Returns the value at the given index in the dynamic array 
        public int get(int index){
            if(index < 0 || index >= size){
                throw new IndexOutOfBoundsException();
            }
            return array[index];
        }

        // Sets the value at the given index in the dynamic array to the given value 
        public void set(int index, int value)
        {
            if(index < 0 || index >= size)
            {
                throw new IndexOutOfBoundsException();
            }
            array[index] = value;
        }

        // Adding a new value at the end of the dynamic array 
        public void add(int value)
        {
            if(size == capacity){
                resize(capacity*2);
            }
            array[size++] = value;
        }
        private void resize(int newCapacity){
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            capacity = newCapacity;
        }


        // Adding a new value at the specified index in the dynamic array 
        public void add(int index, int value)
        {
            if(index < 0 || index > size)
            {
                throw new IndexOutOfBoundsException();
            }
            if(size == capacity){
                resize(capacity*2);
            }
            // Moving all the elements to one position right from specified position 
            System.arraycopy(array, index, array, index+1, size-index);
            array[index] = value;
            size++;
        }

        // Removing the value at the given index from the dynamic array 
        public void remove(int index)
        {
            if(index < 0 || index >= size)
            {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(array, index+1, array, index, size-index-1);
            size--;
            if(size < capacity / 2 && capacity > 1)
            {
                resize(capacity/2);
            }
        }
  
        // Returns the current size of the dynamic array 
        public int size()
        {
            return size;
        }
    }
}


// System.arraycopy(array,0,newArray,0,size )