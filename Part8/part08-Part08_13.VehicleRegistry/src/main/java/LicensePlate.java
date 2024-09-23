
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    // Returns true if the date of the object passed to the method as a parameter is the same as the date of the object used to call the method
    @Override
    public boolean equals(Object object) {
        // Check if the object is the same reference
        if (this == object) {
            return true;
        }

        // Check if the object is an instance of LicensePlate
        if (!(object instanceof LicensePlate)) {
            return false;
        }

        // Cast the object to LicensePlate
        LicensePlate otherLicensePlate = (LicensePlate) object;

        // 
        return this.liNumber.equals(otherLicensePlate.liNumber)
                && this.country.equals(otherLicensePlate.country);
    }

    @Override
    public int hashCode() {
        // Start with a prime number
        int result = 17; // Any non-zero constant can be used

        // Use a prime number to combine the hash codes of the fields
        result = 31 * result + (liNumber != null ? liNumber.hashCode() : 0); // Use String's hashCode
        result = 31 * result + (country != null ? country.hashCode() : 0); // Use String's hashCode

        return result; // Return the computed hash code
    }

}
