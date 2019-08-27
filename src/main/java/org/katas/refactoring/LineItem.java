package org.katas.refactoring;

public class LineItem {
    private String description;
    private double price;
    private int quantity;

    public LineItem(String description, double price, int quantity) {
        super();
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    double totalAmount() {
        return price * quantity;
    }
    
    public StringBuilder printLineItem() {
    	StringBuilder result = new StringBuilder();
    	result.append(this.getDescription() + "\t");
    	result.append(this.getPrice() + "\t");
    	result.append(this.getQuantity() + "\t");
    	result.append(this.totalAmount() + "\n");
    	return result;
    }
    
}