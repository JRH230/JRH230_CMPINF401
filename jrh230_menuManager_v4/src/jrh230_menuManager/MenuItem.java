package jrh230_menuManager;

public class MenuItem {

	private String name;
	private String description;
	private String typeOf;
	private int calories;
	private double price;

	public MenuItem(String name, String typeOf, String description, String itemCaloriesStr, String itemPriceStr) {

		this.name = name;
		this.typeOf = typeOf;
		this.description = description;
		int calories = Integer.parseInt(itemCaloriesStr);
		this.calories = calories;
		double price = Double.parseDouble(itemPriceStr);
		this.price = price;

	}

	public MenuItem(String name, String description, int calories, double price) {

		
	}

	public MenuItem(String name, String description, int calories) {

	}

	public MenuItem(String name, String description) {

	}

	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTypeOf() {
		return typeOf;
	}

	public void setTypeOf(String typeOf) {
		this.typeOf = typeOf;
	}

}
