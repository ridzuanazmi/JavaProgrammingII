
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            switch (command) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add:");
                    String task = scanner.nextLine();
                    this.todoList.add(task);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int remove = Integer.valueOf(scanner.nextLine());
                    this.todoList.remove(remove);
                    break;
                default:
                    break;
            }
        }
    }

}
