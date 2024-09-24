
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class ShoppingCart {
    
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    // Adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
    public void add(String product, int price) {
        // Checks if the shopping cart already contains the item
        if (this.items.containsKey(product)) {
            Item existingItem = this.items.get(product); 
            existingItem.increaseQuantity(); // increase by 1
        } else {
            // Create new item and put it in the shopping cart
            this.items.put(product, new Item(product, 1, price));
        }
    }
    
    // Returns the total price of the shopping cart.
    public int price() {
        int totalPrice = 0;
        // Get items in the shopping cart
        for (Item item : this.items.values()) {
            totalPrice += item.price(); // Add the price of the item into totalPrice
        }
        return totalPrice;
    }
    
    public void print() {
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }
    
}
