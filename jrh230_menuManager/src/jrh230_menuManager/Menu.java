package jrh230_menuManager;

/**
 * Class menu, where the methods for the test are created
 * @author jameshathaway
 * created 10/01/2022
 */

public class Menu {
	private String name;

	private Entree e;
	private Side side;
	private Salad salad;
	private Dessert d;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Menu(String name) {

		this.setName(name);
		this.e = null;
		this.side = null;
		this.salad = null;
		this.d = null;

	}

	public Menu(String name, Entree e, Side side) {

		this.setName(name);
		this.e = e;
		this.side = side;
		salad = null;
		d = null;

	}

	public Menu(String name, Entree e, Side side, Salad salad, Dessert d) {

		this.setName(name);
		this.e = e;
		this.side = side;
		this.salad = salad;
		this.d = d;

	}

	public int totalCalories() {
		int totalCalories = 0;
		if (!(e == null) && !(side == null) && (!(salad == null)) && !(d == null)) {
			totalCalories = e.eCalories + side.sideCalories + salad.saladCalories + d.dCalories; 
		} else if (salad == null || d == null) {
			totalCalories = e.eCalories + side.sideCalories;
		} else {
			if (e == null && side == null && salad == null && d == null) {
				totalCalories = 0;
			}
		}
		return totalCalories;	
	}	


	public String description() {
		String description = "";
		if (!(e == null) && !(side == null) && (!(salad == null)) && !(d == null)) {
			System.out.println(name);
			System.out.println(e.getName() + " " + "\n" + e.getDescription() +  " " + "\n" + e.geteCalories() + " calories");
			System.out.println(side.getName() + " " + "\n" + side.getDescription() +  " " + "\n" + side.getSideCalories() + " calories");
			System.out.println(salad.getName() + " " + "\n" + salad.getDescription() +  " " + "\n" + salad.getSaladCalories() + " calories");
			System.out.println(d.getName() + " " + "\n" + d.getDescription() +  " " + "\n" + d.getdCalories() + " calories");
		} else if (salad == null || d == null) {
			System.out.println(name);
			System.out.println(e.getName() + " " + "\n" + e.getDescription() +  " " + "\n" + e.geteCalories() + " calories");
			System.out.println(side.getName() + " " + "\n" + side.getDescription() +  " " + "\n" + side.getSideCalories() + " calories");
		} else {
			if (e == null && side == null && salad == null && d == null) {
				System.out.println(name);
			}
		}
		return description;
	}
}
