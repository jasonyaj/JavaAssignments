import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 3.99;

        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 4.99;

        Items item3 = new Items();
        item3.name = "drip coffee";
        item3.price = 1.99;

        Items item4 = new Items();
        item4.name = "cappuccino";
        item4.price = 3.50;
    
        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        order1.name = "Cindhuri";
    
        Orders order2 = new Orders();
        order2.name = "Jimmy";
    
        Orders order3 = new Orders();
        order3.name = "Noah";
    
        Orders order4 = new Orders();
        order4.name = "Sam";
    
        // ******** Application Simulations ********
        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri’s order is now ready. Update her status.
        order1.isReady = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;

        // Jimmy’s order is now ready. Update his status.
        order2.isReady = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.isReady);

        // Order 2
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.isReady);

        // Order3
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.isReady);
        
        // Order4
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.isReady);
    }
}
