package jrh230_menuManager;

public class MenuTester{
	public static void main(String[] args){
		MenuRandomizer randomize = new MenuRandomizer("data/entree.txt",
				"data/side.txt","data/salad.txt",
				"data/dessert.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories "+
				myMenu.totalCalories());
		System.out.println(randomize);

	}
}
