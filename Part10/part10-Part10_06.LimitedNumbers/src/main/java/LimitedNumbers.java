
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        // User interface
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input < 0) {
                    break;
                }
                inputs.add(input); // Adds user input into ArrayList inputs;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        
        inputs.stream()
                .filter(input -> input >= 1 && input <= 5)
                .forEach(number -> System.out.println(number));

    }
}
