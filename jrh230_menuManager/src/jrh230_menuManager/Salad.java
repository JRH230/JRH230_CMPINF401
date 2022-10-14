package jrh230_menuManager;

/**
 * Class salad, defines salad and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Salad {
	private String name;
	private String description;
	protected int saladCalories;
	
	public Salad(String name, String description, int saladCalories) {
		this.name = name;
		this.description = description;
		this.saladCalories = saladCalories;
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

	public int getSaladCalories() {
		return saladCalories;
	}

	public void setSaladCalories(int saladCalories) {
		this.saladCalories = saladCalories;
	}
}
