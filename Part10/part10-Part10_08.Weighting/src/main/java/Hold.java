
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        // Calculate the current total weight of the suitcases in the hold
        int currentWeight = this.totalWeight();

        // Check if adding the new suitcase would exceed the maximum weight
        if (currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        return this.suitcases.stream()
                .mapToInt(suitcase -> suitcase.totalWeight()) // Use mapToInt to get an IntStream
                .sum(); // Directly sum the weights
    }

    public void printItems() {
        // Iterate through all suitcases in the hold
        this.suitcases.forEach(suitcase -> {
            // Print all items in each suitcase
            suitcase.printItems();
        });
    }

    @Override
    public String toString() {
        int totalWeight = this.totalWeight();
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
