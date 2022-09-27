package jrh230_lab4;
import javax.swing.JOptionPane;

public class LogarithmsLab {
	public static void main(String args[]) {

		/* notes from lab recitaion
		 * do { x = ...
		 * b = ...
		 * 
		 * } while (condition) x<=0 || b<=1
		 */

		String baseInput;
		String xInput;
		double x = 0;
		double base = 0;
		double log = 0;
		int counter = 0;
		double floorDiv;

		baseInput = JOptionPane.showInputDialog("Enter the value you would like to use for your Base: ");
		xInput = JOptionPane.showInputDialog("Enter the value you would like to use for X: ");
		x = Double.parseDouble(xInput);
		base = Double.parseDouble(baseInput);

		if (x >= 0 || base >=1) {	
			while (x >= base) {
				x/=base;
				counter++;
			}
		}
		JOptionPane.showMessageDialog(null, "Your log, also known as the Y value, is: " + counter);
	}
	// System.out.println(log);
	// }

	/*
		do {

			x = Double.parseDouble(xInput);
			base = Double.parseDouble(baseInput);

		} while (x > 0);
			counter++;


			System.out.println(counter);
			System.out.println(log);
			}
	 */



}

