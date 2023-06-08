import java.util.ArrayList;

public class Order {
    private String name;
    private boolean isReady;
    private ArrayList<Item> items;
    
    // Constructors
    public Order() {
        this.name = "Guest";
        this.items= new ArrayList<Item>();
    }

    // Overloaded constructor, used for different parameters
    public Order(String name) {
        this.name = name;
        this.items= new ArrayList<Item>();
    }

    
    // METHODS
    public void addItem(Item item) {
        items.add(item);
    }

    // public void getStatusMessage() {
    //     System.out.println(isReady ? "Your order is ready" : "Thank you for waiting. Your order will be ready soon.");
    // }
    // getStatusMessage but with a return
    public String getStatusMessage() {
        String message = this.isReady ?  "Your order is ready" : "Thank you for waiting. Your order will be ready soon.";
        return message;
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }

    
    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsReady() {
        return this.isReady;
    }
    public void setIsReady(boolean isReady) {
        this.isReady = isReady;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
    public void getItems(ArrayList<Item> items) {
        this.items = items;
    }

}