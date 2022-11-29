package jrh230_menuManager;

/**
 * Class side, defines side and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Side extends MenuItem {
	
	public String sideCaloriesStr;
	
	public Side(String name, String description, int calories, double price) {
		super(name, description, calories, price);
		super.getName();
		super.getDescription();
		super.getCalories();
		super.getPrice();
		super.setName(name);
		super.setDescription(description);
		super.setCalories(calories);
		super.setPrice(price);
		
	}
	/*
	public Side(String name, String description, String sideCaloriesStr, String sidePriceStr) {
		super(name, description);
		int calories = Integer.parseInt(sideCaloriesStr);
		double price = Double.parseDouble(sidePriceStr);

	}
	/*
	
	public Side(String name, String description, int calories) {
		super(name, description, calories);
		this.name = name;
		this.description = description;
		this.calories = calories;
	
	}
	
	public Side(String name, String description, String sideCaloriesStr) {
		super(name, description);
		this.name = name;
		this.description = description;
		int calories = Integer.parseInt(sideCaloriesStr);
		this.calories = calories;

	}
*/
}
