
import java.util.ArrayList;
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
public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : this.herd) {
            organism.move(dx, dy);
        }
    }

    // Method to return a string representation of the herd
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable member : this.herd) {
            result.append(member.toString()).append("\n"); // Append each member's position
        }
        return result.toString().trim(); // Trim the final string to remove extra newline
    }

}
