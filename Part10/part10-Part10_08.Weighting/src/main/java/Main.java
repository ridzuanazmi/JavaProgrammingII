

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Suitcase m = new Suitcase(20);
        m.addItem(new Item("Carrot", 2));
        m.addItem(new Item("Stick", 8));
        m.addItem(new Item("Cake", 4));
        Item heaviest = m.heaviestItem();
        System.out.println(heaviest);
        m.printItems();
    }

}
