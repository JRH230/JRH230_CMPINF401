package jrh230_menuManager;

/**
 * Class dessert, defines dessert and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Dessert {
	private String name;
	private String description;
	protected int dCalories;

	public Dessert(String name, String description, int dCalories) {
		this.name = name;
		this.description = description;
		this.dCalories = dCalories;

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

	public int getdCalories() {
		return dCalories;
	}

	public void setdCalories(int dCalories) {
		this.dCalories = dCalories;
	}
}
