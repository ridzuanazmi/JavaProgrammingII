
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
public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item != null && (weight() + item.weight() <= maxWeight)) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
            totalWeight += item.weight(); // Accumulate the weight of each item
        }
        return totalWeight; // Return the total weight
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

}
