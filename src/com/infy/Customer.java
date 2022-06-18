package com.infy;

class Food {
	public String foodName;
	public String cuisine;
	public String foodType;
	public int quantityAvailable;
	public double unitPrice;
	
	public void displayCustomerDetails() {
		System.out.println("The food ordered is: "+foodName);
		System.out.println("The Cuisine is: "+cuisine);
		System.out.println("The foodtype is: "+foodType);
		System.out.println("The quantity is: "+quantityAvailable);
		System.out.println("The unitPrice is: "+unitPrice);
	}
}


public class Customer {
    public static void main(String[] args) {
    	Food food=new Food();
    	food.foodName="Hakka";
    	food.cuisine="Noodles";
    	food.foodType="Veg";
    	food.quantityAvailable=2;
    	food.unitPrice=90;
    	
    	food.displayCustomerDetails();
    }
}

