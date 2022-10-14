package jrh230_menuManager;

/**
 * Class side, defines side and creates getter and setters
 * @author jameshathaway
 * created 10/02/2022
 */

public class Side {
	private String name;
	private String description;
	protected int sideCalories;

	public Side(String name, String description, int sideCalories) {
		this.name = name;
		this.description = description;
		this.sideCalories = sideCalories;
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

	public int getSideCalories() {
		return sideCalories;
	}

	public void setSideCalories(int sideCalories) {
		this.sideCalories = sideCalories;
	}
}
