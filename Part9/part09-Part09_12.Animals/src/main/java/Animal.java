/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void eat() {
        System.out.println(getName() + " eats");
    }

    protected void sleep() {
        System.out.println(getName() + " sleeps");
    }
    
    protected String getName() {
        return this.name;
    }
}
