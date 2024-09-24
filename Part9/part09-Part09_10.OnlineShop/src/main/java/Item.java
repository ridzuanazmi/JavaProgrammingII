/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Item {
    
    private String product;
    private int qty; // how many of the product are in the item
    private int unitPrice; // price of a single product

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    // You get the items price by multiplying its unit price by its quantity(qty)
    public int price() {
        return this.unitPrice * this.qty;
    }
    
    // Increases the quantity by one.
    public void increaseQuantity() {
        this.qty++;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
    
}
