package jrh230_menuManager;

/**
 * Class salad, defines salad and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Salad extends MenuItem {

	public String saladCaloriesStr;
	
	
	public Salad(String name, String description, int calories, double price) {
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
	public Salad(String name, String description, String saladCaloriesStr, String saladPriceStr) {
		super(name, description);
		int calories = Integer.parseInt(saladCaloriesStr);
		double price = Double.parseDouble(saladPriceStr);

	}
	/*
	public Salad(String name, String description, int calories) {
		super(name, description, calories);
		this.name = name;
		this.description = description;
		this.calories = calories;
	
	}
	
	public Salad(String name, String description, String saladCaloriesStr) {
		super(name, description);
		this.name = name;
		this.description = description;
		int calories = Integer.parseInt(saladCaloriesStr);
		this.calories = calories;

	}
	
*/
}
