
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
public class MisplacingBox extends Box {

    private ArrayList<Item> items; // List to hold items added to the box
    
    // Constructor for MisplacingBox
    public MisplacingBox() {
        this.items = new ArrayList<>(); // Initialize the list of items
    }

    @Override
    public void add(Item item) {
        if (item != null) {
            items.add(item); // Add the item to the list
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return false; // Always return false, regardless of the item    
    }

}
