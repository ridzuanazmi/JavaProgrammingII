/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Container {

    private int capacity;

    public Container() {
    }

    public int contains() {
        return this.capacity;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.capacity += amount;

        if (this.capacity > 100) {
            this.capacity = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.capacity -= amount;

        if (this.capacity < 0) {
            this.capacity = 0;
        }
    }
    
    // Move liquid to another container
    public void move(Container other, int amount) {
        if (amount < 0) {
            return;
        }

        if (amount > this.capacity) {
            amount = this.capacity; // If we try to move more than we have, move only what we have
        }

        this.remove(amount);
        other.add(amount);
    }

    public String toString() {
        return this.capacity + "/100";
    }
}
