
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// Create two containers
        LiquidContainer first = new LiquidContainer();
        LiquidContainer second = new LiquidContainer();

        while (true) {
            // Print the status of both containers
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // Parse the command and execute the appropriate action
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                first.move(second, amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
