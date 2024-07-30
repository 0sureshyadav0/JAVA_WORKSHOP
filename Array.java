// import java.util.Scanner;

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


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Printing the values
        // for (int i = 0; i < planets.length; i++) {
        // System.out.print(planets[i] + " ");
        // }

    }
}
