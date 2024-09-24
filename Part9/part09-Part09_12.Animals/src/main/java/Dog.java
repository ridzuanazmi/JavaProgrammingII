/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Dog extends Animal implements NoiseCapable {

    // Non-parameterized constructor that gives the dog the name "Dog"
    public Dog() {
        super("Dog");
    }

    // Parameterized constructor to name the dog
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " barks"); // Use getName() to get the dog's name
    }

    // The eat method is inherited from Animal
    // The sleep method is also inherited from Animal

    @Override
    public void makeNoise() {
        this.bark();
    }
}
