package com.codingdojo.coffeedore64;
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
	//using scanner in replacement of System.console(), returns null because no virtual console????
	Scanner in = new Scanner(System.in);
	
	private ArrayList<Item> menu;
	private ArrayList<Order> orders;
	
	//CONSTRUCTORS
	public CoffeeKiosk() {
		menu = new  ArrayList<>();
		orders = new ArrayList<>();
	}
	
	//METHODS
	public void addMenuItem(String name, double price) {
		Item newItem = new Item(name, price);
        int index = menu.size();
        newItem.setIndex(index);
        menu.add(newItem);
	}
	
	
	public void displayMenu() {
		System.out.println("Menu");
		for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
	}
	
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = in.nextLine();
        
    
    	// Your code:
        // Create a new order with the given input string
        Order newOrder = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = in.nextLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
        	try {
        		//Integer.parseInt() converts string of index(aka itemNumber) into an integer
        		newOrder.addItem(menu.get(Integer.parseInt(itemNumber)));
        	}catch(Exception e) {
        		System.out.println("Invalid entry");
        	}
            // Ask them to enter a new item index or q again, and take their input
        	System.out.println("Please enter a menu item index or q to quit");
        	itemNumber = in.nextLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        newOrder.display();
    }

}