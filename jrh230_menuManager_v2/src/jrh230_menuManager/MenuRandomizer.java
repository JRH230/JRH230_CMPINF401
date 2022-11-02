package jrh230_menuManager;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author jameshathaway
 * class MenuRandomizer
 * created 10/27/2022
 */

public class MenuRandomizer {

	ArrayList<Entree> entrees;
	ArrayList<Side> sides;
	ArrayList<Salad> salads;
	ArrayList<Dessert> desserts;
	/**
	 * 
	 * @param entreeFile
	 * @param sideFile
	 * @param saladFile
	 * @param dessertFile
	 * ^^ the data files created will be read in via menuRandomizer
	 * no return value
	 */
	public MenuRandomizer(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entrees = FileManager.readEntree(entreeFile);
		sides = FileManager.readSide(sideFile);
		salads = FileManager.readSalad(saladFile);
		desserts = FileManager.readDessert(dessertFile);
	}
	/**
	 * No parameters as the method just performs calculations
	 * @return the desired random menu
	 */
	public Menu randomMenu(){
		Random r = new Random();
		int max = 5;
		int min = 0;
		int result = r.nextInt(max-min) + min;
		Entree randomEntree = entrees.get(result);

		result = r.nextInt(max-min) + min;
		Side randomSide = sides.get(result);

		result = r.nextInt(max-min) + min;
		Salad randomSalad = salads.get(result);

		result = r.nextInt(max-min) + min;
		Dessert randomDessert = desserts.get(result);

		Menu m1 = new Menu("Randomized Menu", randomEntree, randomSide, randomSalad, randomDessert);
		return m1;
	}



}
