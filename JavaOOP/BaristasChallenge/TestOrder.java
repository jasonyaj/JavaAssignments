public class TestOrder {
    public static void main(String[] args) {

        // Menu item
        Item item1 = new Item("mocha", 3.99);
        Item item2 = new Item("latte", 4.99);
        Item item3 = new Item("drip coffee", 1.99);
        Item item4 = new Item("cappuccino", 3.50);
    

        // ******** Application Simulations ********
        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();
        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Alex");
        Order order4 = new Order("Tee");
        Order order5 = new Order("Thai");
        // Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item2);
        
        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item3);
        order3.addItem(item1);

        order4.addItem(item1);
        order4.addItem(item2);

        order5.addItem(item1);
        order5.addItem(item4);
        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order1.setIsReady(true);
        order2.setIsReady(true);
        // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order1.getOrderTotal());

        
        // ******** Code to test various order' updates ********
        order1.display();
        System.out.println("\n");
        order2.display();
        System.out.println("\n");
        order3.display();
        System.out.println("\n");
        order4.display();
        System.out.println("\n");
        order5.display();
        System.out.println("\n");
        // order1.getStatusMessage(); uncomment to use other method
        System.out.println("\n");
        // order2.getStatusMessage(); uncomment to use other method
        System.out.println("\n");
        System.out.println(order1.getStatusMessage());
        System.out.println(order3.getStatusMessage());
    }
}
