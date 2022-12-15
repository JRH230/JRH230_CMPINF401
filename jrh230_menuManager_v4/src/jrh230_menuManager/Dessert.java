package jrh230_menuManager;

/**
 * Class dessert, defines dessert and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Dessert extends MenuItem{
	
	public String dCaloriesStr;
	
	public Dessert(String name, String description, int calories, double price) {
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
	public Dessert(String name, String description, String dessertCaloriesStr, String dessertPriceStr) {
		super(name, description);
		int calories = Integer.parseInt(dessertCaloriesStr);
		double price = Double.parseDouble(dessertPriceStr);

	}
	/*
	public Dessert(String name, String description, int calories) {
		super(name, description, calories);
		this.name = name;
		this.description = description;
		this.calories = calories;
	
	}

	public Dessert(String name, String description, String dCaloriesStr) {
		super(name, description);
		this.name = name;
		this.description = description;
		int calories = Integer.parseInt(dCaloriesStr);
		this.calories = calories;

	}
	*/

	
}

