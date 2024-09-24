
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Warehouse {

    private Map<String, Integer> prices; // Map to store product prices
    private Map<String, Integer> stock;   // Map to store product stock

    public Warehouse() {
        this.prices = new HashMap<>(); // Initialize the prices map
        this.stock = new HashMap<>();   // Initialize the stock map
    }

    // Method to add a product to the warehouse
    public void addProduct(String product, int price, int stockBalance) {
        prices.put(product, price);       // Store the price of the product
        stock.put(product, stockBalance); // Store the stock balance of the product
    }

    // Returns the price of the product it received as a parameter.
    // If the product hasn't been added to the warehouse, the method must return -99.
    // Method to get the price of a product
    public int price(String product) {
        // Return the price if the product exists, otherwise return -99
        return prices.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (stock.containsKey(product) && stock.get(product) > 0) {
            stock.put(product, stock.get(product) - 1); // Reduce stock by one
            return true; // Successful reduction
        }
        return false; // Product not available or stock is zero
    }
    
    // Returns the names of the products in the warehouse as a Set
    public Set<String> products() {
        return this.stock.keySet();
    }
}
