package jrh230_menuManager;

/**
 * Class menutest, creates instance variables and tests the methods that were created
 * in the menu method 
 * @author jameshathaway
 * created 10/09/2022
 */

public class menuTest {

	public static void main(String[] args) {

		Entree e = new Entree("Grilled Chicken Breast: ", "Tonight's main course consists of a"
				+ " juicy chicken breast served along a choice of side and salad. ", 250);

		Entree e1 = new Entree("Lobster Tail: ", "Tonight's main course consists of a" 
				+ " freshly caught lobster tail served along a choice of side and salad. ", 350);

		Side side = new Side("Steamed broccoli and white rice: ", "Our farm-picked fresh broccoi along with"
				+ " white rice. Cheese is available for broccoli at request. ", 400);

		Side side1 = new Side("Mashed potatoes and gravy: ", "Our farm-picked freshly made mashed potatoes"
				+ " with gravy. ", 500);

		Salad salad = new Salad("House Salad: ", "Our house salad includes lettuce, tomatoes, cucumbers"
				+ " croutons, bacon, and cheese along with a choice of dressing. ", 450);

		Dessert d = new Dessert("Double Fudge Brownies: ", "For our dessert tonight, we have our freshly "
				+ "baked double fudge melt in your mouth brownies. ", 600);

		// Menu emptyMenu = new Menu("Empty Menu");
		
		// String eMenuDesc = emptyMenu.description();
		// System.out.println(eMenuDesc);
		// int eMenuCals = emptyMenu.totalCalories();
		// System.out.println("The total calories of this menu is: " + eMenuCals);
		
		Menu fullMenu = new Menu("Full Menu", e, side, salad, d);

		String fMenuDesc = fullMenu.description();
		System.out.println(fMenuDesc);
		int fMenuCals = fullMenu.totalCalories();
		System.out.println("The total calories of this menu is: " + fMenuCals);


		Menu partialMenu = new Menu("\n" + "Partial Menu", e1, side1);

		String pMenuDesc = partialMenu.description();
		System.out.println(pMenuDesc);
		int pMenuCals = partialMenu.totalCalories();
		System.out.println("The total calories of this menu is: " + pMenuCals);




	}

}
