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
	@Override
	public String toString() {
		return this.name;
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

	/* public int totalCalories() {
		int totalCalories = 0;
		if (!(e == null) && !(side == null) && (!(salad == null)) && !(d == null)) {
			totalCalories = e.calories + side.calories + salad.calories + d.calories; 
		} else if (salad == null || d == null) {
			totalCalories = e.calories + side.calories;
		} else {
			if (e == null && side == null && salad == null && d == null) {
				totalCalories = 0;
			}
		}
		return totalCalories;	
	}	
*/
	
	public int totalCalories() {
		int entreeCal = 0;
		if (e != null) {
			entreeCal = e.getCalories();
		}
		int sideCal = 0;
		if (side != null) {
			sideCal = side.getCalories();
		}
		int saladCal = 0;
		if (salad != null) {
			saladCal = salad.getCalories();
		}
		int dessertCal = 0;
		if (d != null) {
			dessertCal = d.getCalories();
		}
		return entreeCal + sideCal + saladCal + dessertCal;
	}
	
	public double totalPrice() {
		double entreePr = 0;
		if (e != null) {
			entreePr = e.getPrice();
		}
		double sidePr = 0;
		if (side != null) {
			sidePr = side.getPrice();
		}
		double saladPr = 0;
		if (salad != null) {
			saladPr = salad.getPrice();
		}
		double dessertPr = 0;
		if (d != null) {
			dessertPr = d.getPrice();
		}
		return entreePr + sidePr + saladPr + dessertPr;
	}

	public String description() {
		String description = "";
		if (!(e == null) && !(side == null) && (!(salad == null)) && !(d == null)) {
			System.out.println(name);
			System.out.println(e.getName() + " " + "\n" + e.getDescription() +  " " + "\n" + e.getCalories() + " calories");
			System.out.println(side.getName() + " " + "\n" + side.getDescription() +  " " + "\n" + side.getCalories() + " calories");
			System.out.println(salad.getName() + " " + "\n" + salad.getDescription() +  " " + "\n" + salad.getCalories() + " calories");
			System.out.println(d.getName() + " " + "\n" + d.getDescription() +  " " + "\n" + d.getCalories() + " calories");
		} else if (salad == null || d == null) {
			System.out.println(name);
			System.out.println(e.getName() + " " + "\n" + e.getDescription() +  " " + "\n" + e.getCalories() + " calories");
			System.out.println(side.getName() + " " + "\n" + side.getDescription() +  " " + "\n" + side.getCalories() + " calories");
		} else {
			if (e == null && side == null && salad == null && d == null) {
				System.out.println(name);
			}
		}
		return description;
	}
}
