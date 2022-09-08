package jrh230_lab2;
import javax.swing.JOptionPane;

public class apofcircle {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter the radius of a circle");
		double r = Double.parseDouble(input);
		
		double perimeter = 2 * Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);
		
		
		JOptionPane.showMessageDialog(null, "The circle has a radius of " + (r));
		JOptionPane.showMessageDialog(null, "The circle has an area of " + (area));
		JOptionPane.showMessageDialog(null, "The circle has a perimeter of " + (perimeter));
	}

}
