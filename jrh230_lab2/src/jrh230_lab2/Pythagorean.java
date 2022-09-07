package jrh230_lab2;
import javax.swing.JOptionPane;

public class Pythagorean {

	public static void main(String[] args) {
		
		String sideA1;
		sideA1 = JOptionPane.showInputDialog("Enter the value of side A of the triangle");
		String sideB1;
		sideB1 = JOptionPane.showInputDialog("Enter the value of side B of the triangle");
		
		double sideA = Double.parseDouble(sideA1);
		double sideB = Double.parseDouble(sideB1);
		
		double sideA2, sideB2; // squared value of both inputted sides
		sideA2 = Math.pow(sideA, 2);
		sideB2 = Math.pow(sideB, 2);
		double sum = sideA2 + sideB2;
		double hypotenuse = Math.sqrt(sum);
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is " + (hypotenuse)); 
		
		

	}

}
