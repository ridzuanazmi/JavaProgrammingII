
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
public class BoxWithMaxWeight extends Box {
    
    private int maxWeight; // Maximum weight capacity of the box
    private ArrayList<Item> items; // List to store items in the box
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        // Check if adding the item exceeds the max weight
        if (item != null && (getCurrentWeight() + item.getWeight() <= maxWeight)) {
            items.add(item); // Add the item to the box
        } else {
            System.out.println("Cannot add item: exceeds maximum weight.");
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    // Method to calculate the current weight of the items in the box
    private int getCurrentWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight(); // Accumulate the weight of each item
        }
        return totalWeight; // Return the total weight
    }
    
}
