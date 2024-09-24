
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageContents;

    public StorageFacility() {
        this.storageContents = new HashMap<>();
    }

    // Adds the parameter item to the storage unit that is also given as a parameter.
    public void add(String unit, String item) {
        // An empty list has to be added for a new user if one has not already been added
        this.storageContents.putIfAbsent(unit, new ArrayList<>());

        // Adds the item into the unit specified
        this.storageContents.get(unit).add(item);
    }

    // Returns a list that contains all the items in the storage unit indicated by the parameter
    // If there is no such storage unit or it contains no items, the method should return an empty list.
    public ArrayList<String> contents(String storageUnit) {
        return this.storageContents.getOrDefault(storageUnit, new ArrayList<>());
    }

    // Removes the given item from the given storage unit
    // Only removes one item — if there are several items with the same name, the rest still remain. 
    // If the storage unit would be empty after the removal, the method also removes the unit.
    public void remove(String storageUnit, String item) {
        ArrayList<String> storageItems = this.storageContents.get(storageUnit);
        // Check if the storage unit exists and is not null
        if (storageItems != null) {
            // Attempt to remove the item
            storageItems.remove(item);

            // Check if the storage unit is now empty
            if (storageItems.isEmpty()) {
                this.storageContents.remove(storageUnit);
            }
        }
    }

    // Returns the names of the storage units as a list
    // NB! Only the units that contain items are listed
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>(); // Initialize the ArrayList
        for (String unit : this.storageContents.keySet()) {
            // Check if the storage unit contains items
            if (this.storageContents.get(unit).size() > 0) {
                storageUnits.add(unit); // Add the unit to the list if it has items
            }
        }
        return storageUnits;
    }
}
