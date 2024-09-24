
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    // Adds provided status as the latest amount to remember in the change history.
    public void add(double status) {
        this.changeHistory.add(status);
    }

    // Empties the history
    public void clear() {
        this.changeHistory.clear();
    }

    // Returns the largest value in the change history
    public double maxValue() {
        if (isEmpty()) {
            return 0;
        }
        return Collections.max(this.changeHistory);
    }

    // Returns the smallest value in the change history.
    // If the history is empty, the method should return zero.
    public double minValue() {
        if (isEmpty()) {
            return 0;
        }
        return Collections.min(this.changeHistory);
    }

    // Returns the average of the values in the change history.
    // If the history is empty, the method should return zero.
    public double average() {
        if (isEmpty()) {
            return 0; // Indicate that average cannot be computed
        }

        double sum = 0;
        for (Double change : this.changeHistory) {
            sum += change;
        }

        return sum / this.changeHistory.size(); // Directly return the average
    }

    protected boolean isEmpty() {
        return this.changeHistory.isEmpty();
    }

    @Override
    public String toString() {
        return this.changeHistory.toString();
    }

}
