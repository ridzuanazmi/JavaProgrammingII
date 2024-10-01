
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        // User interface
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input); // Adds user input into ArrayList inputs;
        }
        
        // Stream the inputs ArrayList
        double average = inputs.stream()
                .mapToInt(input -> Integer.valueOf(input)) // Convert String to int
                .average() // calculate the average of the numbers
                .getAsDouble(); // Convert value into double
        
        // display avergae value
        System.out.println("average of the numbers: " + average);

    }
}
