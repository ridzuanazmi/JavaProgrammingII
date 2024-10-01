
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = "quit";
            String input = scanner.nextLine();

            if (input.equals(continueQ)) {
                break;
            }

            System.out.println("Input first name: ");
            String firstName = "NaN";
            if (scanner.hasNextLine()) {
                firstName = scanner.nextLine();
            }
            System.out.println("Input last name: ");
            String lastName = "NaN";
            if (scanner.hasNextLine()) {
                lastName = scanner.nextLine();
            }
            System.out.println("Input the year of birth: ");
            int birthYear = 0;
            if (scanner.hasNextLine()) {
                birthYear = Integer.valueOf(scanner.nextLine());
            }

            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

        // Implement the printing of the unique last names in alphabetical order here:
        System.out.println("Unique last names in alphabetical order:");
        persons.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(person -> System.out.println(person));
    }
}
