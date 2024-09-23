
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("Matthew", "matt");
        nicknames.put("Michael", "mix");
        nicknames.put("Arthur", "artie");
        System.out.println("Matthew's nickname is " + nicknames.get("Matthew"));
    }

}
