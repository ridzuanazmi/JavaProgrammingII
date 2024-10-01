/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class LiteracyRate implements Comparable<LiteracyRate> {

    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public LiteracyRate(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    @Override
    public int compareTo(LiteracyRate o) {
        return Double.compare(this.literacyRate, o.getLiteracyRate());
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyRate;
    }
    
    

}
