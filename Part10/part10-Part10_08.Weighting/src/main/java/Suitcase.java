
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        // Calculate the current total weight of the items in the suitcase
        int currentWeight = this.totalWeight();

        // Add the item only if it doesn't exceed the maximum weight
        if (currentWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        total = this.items.stream()
                .map(item -> item.getWeight())
                .reduce(total, Integer::sum);
        return total;
    }

    // Method to print all items in the suitcase
    public void printItems() {
        this.items.forEach(item -> {
            System.out.println(item);
        });
    }

    // Method to get the heaviest item
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null; // If there are no items, return null
        }

        Item heaviestItem = this.items.stream()
                .reduce((item1, item2) -> item1.getWeight() > item2.getWeight() ? item1 : item2) //  Combines the items in the stream based on the provided binary operator. It compares the weights of two items and keeps the heavier one.
                .orElse(null); // or handle the case when the list is empty
        return heaviestItem;
    }

    public String toString() {
        int totalWeight = this.totalWeight();

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        } else {
            return this.items.size() + " items (" + totalWeight + " kg)";
        }
    }
}
