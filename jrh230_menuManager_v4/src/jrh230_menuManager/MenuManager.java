package jrh230_menuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	protected ArrayList<Entree> entrees;
	protected ArrayList<Side> sides;
	protected ArrayList<Salad> salads;
	protected ArrayList<Dessert> desserts;

	public MenuManager() {
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
	}
	
	public MenuManager(String dishesFile) {
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
	
		ArrayList<MenuItem> menuItems = FileManager.readItems(dishesFile);
		for(MenuItem i : menuItems) {
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
	
	
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;

	public void splitItemLists(ArrayList<MenuItem> dishesMenu) {

		for(MenuItem i : dishesMenu) {
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
		int max = 4;
		int result = r.nextInt(max - 1);
		//System.out.println(result);
		Entree randomEntree = entrees.get(result);
		//System.out.println(randomEntree);

		result = r.nextInt(max - 1);
		Side randomSide = sides.get(result);

		result = r.nextInt(max - 1);
		Salad randomSalad = salads.get(result);

		result = r.nextInt(max - 1);
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
