
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class IOU {

    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<>();
    }

    // Saves the amount owed and the person owed to to the IOU
    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }

    // Returns the amount owed to the person whose name is given as a parameter. 
    // If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        if (this.iou.containsKey(toWhom)) {
            return this.iou.get(toWhom);
        }
        return 0;
    }

}
