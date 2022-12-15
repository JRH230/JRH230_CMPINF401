package jrh230_menuManager;

import java.util.ArrayList;

public class MenuTester{
	public static void main(String[] args){
		/*
		MenuRandomizer randomize = new MenuRandomizer("data/entree.txt",
				"data/side.txt","data/salad.txt",
				"data/dessert.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories "+
				myMenu.totalCalories());
		System.out.println(randomize);
		*/
		
		/*
		MenuManager mm = new MenuManager("data/dishes.txt");
		ArrayList<Entree> entreList = mm.getEntrees();
		for(Entree e : entreList) {
			System.out.println(e.getDescription());
		}
		*/
		
		ArrayList<MenuItem> itemList = FileManager.readItems("data/dishes.txt");
		for(MenuItem mi : itemList) {
			System.out.println(mi);
		}

	}
}
