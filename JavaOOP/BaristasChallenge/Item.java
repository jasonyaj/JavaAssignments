public class Item {
    private String name;
    private double price;

    // constructors
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice() {
        this.price = price;
    }
}