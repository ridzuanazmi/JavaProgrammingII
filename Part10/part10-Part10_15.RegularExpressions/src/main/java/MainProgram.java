
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner reader = new Scanner(System.in);
        Checker checker = new Checker();
        System.out.println("Enter a string: ");
        String text = reader.nextLine();
//        if (checker.isDayOfWeek(text)) {
//            System.out.println("The form is correct.");
//        } else {
//            System.out.println("The form is incorrect.");
//        }
//        if (checker.allVowels(text)) {
//            System.out.println("The form is correct.");
//        } else {
//            System.out.println("The form is incorrect.");
//        }
        if (checker.timeOfDay(text)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
    }
}
