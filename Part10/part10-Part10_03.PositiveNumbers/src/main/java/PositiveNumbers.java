
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        List<Integer> numbers = new ArrayList<>();

        // Read input until "end" is entered
        System.out.println("Enter numbers (type 'end' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        
        List<Integer> positives = positive(numbers);
        System.out.println(positives);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream() // Stream the array list
                .filter(number -> number > 0) // filter by positive numbers only
                .collect(Collectors.toList()); // after filtering, collect it in a new List
    }

}
