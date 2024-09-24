
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
public class ProductWarehouse extends Warehouse {

    private String productName;

    // Creates an empty product warehouse
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    // Returns the name of the product
    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() {
        return this.productName + ": " + super.toString();
    }

}
