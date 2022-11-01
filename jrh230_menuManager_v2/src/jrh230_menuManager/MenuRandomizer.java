package jrh230_menuManager;
import java.util.ArrayList;

public class MenuRandomizer {
	
	ArrayList<Entree> entrees;
	ArrayList<Side> sides;
	ArrayList<Salad> salads;
	ArrayList<Dessert> desserts;
	
	public MenuRandomizer(String entreeFile, String sideFile, String saladFile, String dessertFile) {
			entrees = FileManager.readEntree(entreeFile);
			sides = FileManager.readSide(sideFile);
			salads = FileManager.readSalad(saladFile);
			desserts = FileManager.readDessert(dessertFile);
	}
	
	MenuRandomizer m = new MenuRandomizer("/jrh230_menuManager_v2/data/entree.txt", 
			"/jrh230_menuManager_v2/data/side.txt", 
			"/jrh230_menuManager_v2/data/salad.txt", 
			"/jrh230_menuManager_v2/data/dessert.txt");
	
	
	/* public boolean isConsecutive(ArrayList<Object> object) {
		for (int i = 1; i < object.size(); i++) {
			
		}
	} */
	
	public Menu randomMenu(){
		/* for(int i = 0; i<entrees.size(); i++) {
			String[] eMenuFiller = 
		}
		*/
		Menu m1 = new Menu("fill later");
	return m1;
	}


}

