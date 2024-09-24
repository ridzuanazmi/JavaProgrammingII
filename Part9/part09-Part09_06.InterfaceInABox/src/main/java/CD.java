/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class CD implements Packable {

    private String artist;
    private String name;
    private int publicationYear;
    private final double weight = 0.1; // Weight of all CDs is 0.1 kg

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }

}
