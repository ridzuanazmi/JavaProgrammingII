
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    // Returns true if the date of the object passed to the method as a parameter is the same as the date of the object used to call the method
    @Override
    public boolean equals(Object object) {
        // Check if the object is the same reference
        if (this == object) {
            return true;
        }

        // Check if the object is an instance of SimpleDate
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        // Cast the object to SimpleDate
        SimpleDate otherDate = (SimpleDate) object;

        // Compare the day, month, and year
        return this.day == otherDate.day
                && this.month == otherDate.month
                && this.year == otherDate.year;
    }

    // Optionally, override hashCode() for consistency
    @Override
    public int hashCode() {
        int result = day;
        // Multiplying by a prime number (like 31) helps to spread out the values more uniformly in the hash table, reducing collisions.
        result = 31 * result + month;
        result = 31 * result + year;
        return result; // Return the computed hash code
    }

}
