package jrh230_lab2;
import javax.swing.JOptionPane;

public class MoneyDecomp {
	
	public static void main(String[] args) {

	String input = JOptionPane.showInputDialog("Enter the desired dollar amount");
	int money = Integer.parseInt(input);
	
	int grand, bens, saws, bucks;
	
	bucks = money % 10;
	money /= 10;
	saws = money % 10;
	money /= 10;
	bens = money % 10;
	money /= 10; 
	grand = money % 10;
	money /= 10;
	
	System.out.println(grand + " grands" + "\n" + bens + " benjamins" + "\n" + saws + " sawbucks" + "\n" + bucks + " bucks");
	
	
	// JOptionPane.showMessageDialog(null, ""+ (grand = money % 1000));
	// bens = money / 100;
	// bens = money % 100;
	
	
	
	
	
	
	// JOptionPane.showMessageDialog(null, ""+ (grand) + " grands");
	// JOptionPane.showMessageDialog(null, ""+ (bens) + " Benjamins");
	// JOptionPane.showMessageDialog(null, ""+ (saws) + " sawbucks");
	// JOptionPane.showMessageDialog(null, ""+ (bucks) + " bucks");
	
	}
}
