
import java.util.Objects;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        // Check if the object is the same reference
        if (this == obj) {
            return true;
        }

        // Check if the object is an instance of Item
        if (!(obj instanceof Item)) {
            return false;
        }

        // Cast the object to Item
        Item other = (Item) obj;

        // Compare names for equality
        return Objects.equals(name, other.name);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        // Use the name for hash code computation, ignoring weight
        return Objects.hash(name);
    }

}
