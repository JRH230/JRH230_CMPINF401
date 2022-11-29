package jrh230_menuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
	}
	
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;

	public void splitItemLists(ArrayList<MenuItem> items, ArrayList<Entree> entrees, ArrayList<Side> sides, 
			ArrayList<Salad> salads, ArrayList<Dessert> desserts) {

		for(MenuItem i : items) {
			if(i instanceof Entree) {
				entree = new Entree(i.getName(),i.getDescription(), i.getCalories(), i.getPrice());
				entrees.add(entree);
			}
			if(i instanceof Side) {
				side = new Side(i.getName(),i.getDescription(), i.getCalories(), i.getPrice());
				sides.add(side);
			}
			if(i instanceof Salad) {
				salad = new Salad(i.getName(),i.getDescription(), i.getCalories(), i.getPrice());
				salads.add(salad);
			}
			if(i instanceof Dessert) {
				dessert = new Dessert(i.getName(),i.getDescription(), i.getCalories(), i.getPrice());
				desserts.add(dessert);
			}

		}


	}

	public ArrayList<Menu> menuList(){
		ArrayList<Menu> menus = new ArrayList<Menu>();
		for (int i = 1; i < 11; i++) {
			menus.add(randomMenu("Menu" + i));
		}
		return menus;
	}

	public Menu randomMenu(String name){
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

		Menu m1 = new Menu(name, randomEntree, randomSide, randomSalad, randomDessert);
		return m1;
	}



	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}


}
