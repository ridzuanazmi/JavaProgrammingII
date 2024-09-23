
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Create two containers
        Container first = new Container();
        Container second = new Container();

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

            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    first.move(second, amount);
                    break;
                case "remove":
                    second.remove(amount);
                    break;
                default:
                    break;
            }
        }
    }
}
