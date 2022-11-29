package jrh230_menuManager;

/**
 * Class entree, defines entree and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Entree extends MenuItem {
	
	public String eCaloriesStr;


	public Entree(String name, String description, int calories, double price) {
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
}
	
	/* public Entree(String name, String description, String eCaloriesStr, String ePriceStr) {
		super(name, description);
		int calories = Integer.parseInt(eCaloriesStr);
		double price = Double.parseDouble(ePriceStr);
}
}
	/*
	public Entree(String name, String description, int calories) {
		super(name, description, calories);
		this.name = name;
		this.description = description;
		this.calories = calories;
	
	}

	
	public Entree(String name, String description, String eCaloriesStr) {
		super(name, description);
		this.name = name;
		this.description = description;
		int calories = Integer.parseInt(eCaloriesStr);
		this.calories = calories;

	}
	
	public Entree(String name, String description, String eCaloriesStr, String ePriceStr) {
		super(name, description);
		this.name = name;
		this.description = description;
		int calories = Integer.parseInt(eCaloriesStr);
		this.calories = calories;
		double price = Double.parseDouble(ePriceStr);
		this.price = price;

	}

} */
