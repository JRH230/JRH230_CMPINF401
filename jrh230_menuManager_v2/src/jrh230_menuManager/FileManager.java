package jrh230_menuManager;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author jameshathaway
 * Class FileManager
 * Created 10/27/2022
 */
public class FileManager {
	/**
	 * 
	 * @param fileName data being passed through the readEntree call
	 * @return arraylist of entrees
	 */
	public static ArrayList<Entree> readEntree (String fileName) {
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){ 
			while(br.ready()) {
				String line = br.readLine(); 
				String[] entreeArray = line.split("@@");
				entrees.add(new Entree(entreeArray[0], entreeArray[1], entreeArray[2]));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return entrees;
	}
	/**
	 * 
	 * @param fileName data being passed through the readSide call
	 * @return arraylist of sides
	 */
	public static ArrayList<Side> readSide (String fileName) {
		ArrayList<Side> sides = new ArrayList<Side>();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){ 
			while(br.ready()) {
				String line = br.readLine();
				String[] sideArray = line.split("@@");
				sides.add(new Side(sideArray[0], sideArray[1], sideArray[2]));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return sides;
	}
	/**
	 * 
	 * @param fileName data being passed through the readSalad call
	 * @return arraylist of salads
	 */
	public static ArrayList<Salad> readSalad (String fileName) {
		ArrayList<Salad> salads = new ArrayList<Salad>();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){ 
			while(br.ready()) {
				String line = br.readLine();
				String[] saladArray = line.split("@@");
				salads.add(new Salad(saladArray[0], saladArray[1], saladArray[2]));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return salads;
	}
	/**
	 * 
	 * @param fileName data being passed through the readDessert call
	 * @return arraylist of desserts
	 */
	public static ArrayList<Dessert> readDessert (String fileName) {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){ 
			while(br.ready()) {
				String line = br.readLine();
				String[] dessertArray = line.split("@@");
				desserts.add(new Dessert(dessertArray[0], dessertArray[1], dessertArray[2]));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return desserts;
	}


}


