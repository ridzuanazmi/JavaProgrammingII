
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
public class OneItemBox extends Box {

    private Item item;

    public OneItemBox() {
        this.item = null;
    }

    @Override
    public void add(Item item) {
        // Only add the item if the box is empty
        if (this.item == null) {
            this.item = item; // Set the item in the box
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item != null && this.item.equals(item); // Check if the item is the same as the one in the box
    }

}
