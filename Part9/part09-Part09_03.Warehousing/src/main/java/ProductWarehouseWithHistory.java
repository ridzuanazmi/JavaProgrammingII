/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory; // ChangeHistory object for managing history

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance); // Set the initial balance in the warehouse
        changeHistory = new ChangeHistory(); // Initialize the ChangeHistory object
        changeHistory.add(initialBalance); // Add the initial balance to the history
    }

    // Returns the product history like this [0.0, 119.2, 21.2].
    // Use the string representation of the ChangeHistory object as is.
    public String history() {
        return changeHistory.toString(); // Return the string representation of the change history
    }

    // Override addToWarehouse method to also record the changed state
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); // Call the superclass method to add the amount
        changeHistory.add(getBalance()); // Record the new balance after addition
    }

    // Override takeFromWarehouse method to also record the changed state
    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount); // Call the superclass method to take the amount
        changeHistory.add(getBalance()); // Record the new balance after removal
        return takenAmount; // Return the amount taken
    }

    // Method to print analysis of the product's change history
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }

}
