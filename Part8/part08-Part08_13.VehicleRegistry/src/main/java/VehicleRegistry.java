
import java.util.HashMap;
import java.util.HashSet;
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    // assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter. 
    // If the license plate doesn't have an owner, the method returns true. 
    // If the license already has an owner attached, the method returns false and does nothing.
    public boolean add(LicensePlate licensePlate, String owner) {

        // Check first if licensePlate is already taken
        if (checkRegistry(licensePlate)) {
            return false; // Already has an owner
        }

        // Assigns the owner to the licensePlate
        this.registry.put(licensePlate, owner);
        return true; // Successfully added
    }

    // Returns the owner of the car corresponding to the license plate received as a parameter. 
    // If the car isn't in the registry, the method returns null.
    public String get(LicensePlate licensePlate) {
        if (!checkRegistry(licensePlate)) {
            return null;
        }
        return this.registry.get(licensePlate);
    }

    // Removes the license plate and attached data from the registry. 
    // The method returns true if removed successfully and false if the license plate wasn't in the registry.
    public boolean remove(LicensePlate licensePlate) {
        if (!checkRegistry(licensePlate)) {
            return false;
        }
        this.registry.remove(licensePlate);
        return true;
    }

    // Prints the license plates in the registry.
    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    // Prints the owners of the cars in the registry
    // Each name should only be printed once, even if a particular person owns more than one car.
    public void printOwners() {
        // Set to store the unique owners since a Set automatically handles duplicates
        Set<String> uniqueOwners = new HashSet<>(registry.values()); // A HashSet is created from the values of the registry map
        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }

    private boolean checkRegistry(LicensePlate licensePlate) {
        return this.registry.containsKey(licensePlate);
    }

}
