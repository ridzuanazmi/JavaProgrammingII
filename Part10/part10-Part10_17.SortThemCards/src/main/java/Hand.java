
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream()
                .forEach(card -> System.out.println(card));
    }

    // Method to calculate the sum of card values in the hand
    private int getHandValue() {
        return this.cards.stream()
                .mapToInt(Card::getValue)
                .sum(); // Sum of card values
    }

    // Method to sort the cards in the hand
    public void sort() {
        // Sort the cards using the compareTo method from the Card class
        Collections.sort(this.cards);

        // Print the sorted cards
//        this.cards.forEach(card -> System.out.println(card));
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand other) {
        // Compare the sum of card values in this hand with the sum of card values in the other hand
        return Integer.compare(this.getHandValue(), other.getHandValue());
    }

}
