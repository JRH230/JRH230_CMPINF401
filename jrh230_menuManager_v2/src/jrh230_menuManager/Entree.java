package jrh230_menuManager;

/**
 * Class entree, defines entree and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Entree {
	private String name;
	private String description;
	protected int eCalories;

	public Entree(String name, String description, int eCalories) {
		this.name = name;
		this.description = description;
		this.eCalories = eCalories;

	}
	
	public Entree(String name, String description, String eCaloriesStr) {
		this.name = name;
		this.description = description;
		int eCalories = Integer.parseInt(eCaloriesStr);
		this.eCalories = eCalories;

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

	public int geteCalories() {
		return eCalories;
	}

	public void seteCalories(int eCalories) {
		this.eCalories = eCalories;
	}
}
