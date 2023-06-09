package com.codingdojo.coffeedore64;
import java.util.ArrayList;

public class Order {
	private String name;
	private ArrayList<Item> items;
	
	//CONSTRUCTOR
	public Order(String name, ArrayList<Item> items) {
		this.name = name;
		this.items = new ArrayList<Item>();
	}
	
	//OVERLOAD CONSTRUCTOR
	public Order(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
	}

	
	//METHODS
	public void addItem(Item item) {
		items.add(item);
	}
	
	public double getOrderTotal() {
        // variable to hold math of adding prices
		double total = 0;
        // for(Class Item, create variable item : items from this Order class)
		for (Item item : items) {
            total += item.getPrice();
        }
        return total;
	}
	
	public void display() {
		System.out.println("Thank you, " + getName() + ". Here are your order details:");
		System.out.println("Customer Name: " + getName());
		for (Item item : items) {
			System.out.println(item.getName() + " - " + item.getPrice());
		}
		System.out.println("Total: " + getOrderTotal());
	}
	
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
