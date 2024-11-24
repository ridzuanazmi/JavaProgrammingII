
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> {
            this.employees.add(person);
        });
    }

    public void print() {
        this.employees.stream().forEach(person -> {
            System.out.println(person);
        });
    }

    public void print(Education education) {
        // Create an iterator for the employees list
        Iterator<Person> iterator = this.employees.iterator();

        // Iterate through the list
        while (iterator.hasNext()) {
            Person employee = iterator.next();

            // Check if the employee's education matches the given education
            if (employee.getEducation() == education) {
                // Print the employee details
                System.out.println(employee.toString());
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                iterator.remove();  // Safe removal
            }
        }
    }

}
