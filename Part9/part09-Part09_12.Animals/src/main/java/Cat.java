/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Cat extends Animal implements NoiseCapable {
    
    public Cat(String name) {
        super(name);
    }
    
    public Cat() {
        super("Cat");
    }
    
    public void purr() {
        System.out.println(getName() + " purrs"); // Use getName() to get the dog's name
    }
    
    // The eat method is inherited from Animal
    // The sleep method is also inherited from Animal

    @Override
    public void makeNoise() {
        this.purr();
    }
    
}
