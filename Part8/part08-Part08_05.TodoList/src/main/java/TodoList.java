
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class TodoList {

    private ArrayList<String> tasks;

    // Constructor without parameters
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    // Method to add a task to the todo list
    public void add(String task) {
        this.tasks.add(task);
    }

    // Method to print the tasks with their associated number (index + 1)
    public void print() {
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println((i + 1) + ": " + this.tasks.get(i));
        }
    }

    // Method to remove a task based on the task number (index + 1)
    public void remove(int number) {
        if (number > 0 && number <= this.tasks.size()) {
            this.tasks.remove(number - 1);  // Remove the task at index (number - 1)
        }
    }

}
