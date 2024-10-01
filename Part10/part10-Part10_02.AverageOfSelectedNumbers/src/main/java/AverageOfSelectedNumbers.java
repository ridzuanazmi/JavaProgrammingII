
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

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

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String negOrPos = scanner.nextLine();
        double average = 0;
        // Stream the inputs ArrayList
        if (negOrPos.equals("n")) {
            average = inputs.stream()
                    .mapToInt(input -> Integer.valueOf(input)) // Convert String to int
                    .filter(number -> number <= 0) // Filter only negative numbers
                    .average() // calculate the average of the numbers
                    .getAsDouble(); // Convert value into double
        } else if (negOrPos.equals("p")) {
            average = inputs.stream()
                    .mapToInt(input -> Integer.valueOf(input)) // Convert String to int
                    .filter(number -> number >= 0) // Filter only positive numbers
                    .average() // calculate the average of the numbers
                    .getAsDouble(); // Convert value into double
        }

        // display avergae value
        System.out.println("average of the numbers: " + average);

    }
}
