package jrh230_lab3;
import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		// parse input, gather unit from parsing use string.split and store in array, substring
		
		String input = JOptionPane.showInputDialog("Enter a distance or weight amount followed by the unit: ");
		
		String userInput[] = input.split(" ");

		// System.out.println(userInput[0]);
		
		for (int i = 0; i < userInput.length; i++) {
			 if (i == 0) {
				 String amount = userInput[0];
				 String unit = userInput[1];
				// System.out.println(amount + unit);
				 	if (unit.equalsIgnoreCase("cm")) {
				 		double amount1 = Double.parseDouble(amount);
				 		// System.out.println(amount1);
				 		amount1 *= 0.393701;
				 		System.out.println((amount + " " + unit) + " = " + amount1 + " inches");
				 	
				 	} else if (unit.equalsIgnoreCase("in")) {
				 		double amount2 = Double.parseDouble(amount);
				 		amount2 *= 2.54;
				 		System.out.println((amount + " " + unit) + " = " + amount2 + " centimeters");
				 		
				 	} else if (unit.equalsIgnoreCase("yd")) {
				 		double amount3 = Double.parseDouble(amount);
				 		amount3 *= 0.9144;
				 		System.out.println((amount + " " + unit) + " = " + amount3 + " meters");
				 	
				 	} else if (unit.equalsIgnoreCase("m")) {
				 		double amount4 = Double.parseDouble(amount);
				 		amount4 *= 1.09361; // yards conversion
				 		System.out.println((amount + " " + unit) + " = " + amount4 + " yards");
				 		
				 	} else if (unit.equalsIgnoreCase("oz")) {
				 		double amount5 = Double.parseDouble(amount);
				 		amount5 *= 28.3495; // grams conversion
				 		System.out.println((amount + " " + unit) + " = " + amount5 + " grams");
				 		
				 	} else if (unit.equalsIgnoreCase("gm")) {
				 		double amount6 = Double.parseDouble(amount);
				 		amount6 *= 0.035274;
				 		System.out.println((amount + " " + unit) + " = " + amount6 + " ounces");
				 			
				 	} else if (unit.equalsIgnoreCase("lb")) {
				 		double amount7 = Double.parseDouble(amount);
				 		amount7 *= 0.453592;
				 		System.out.println((amount + " " + unit) + " = " + amount7 + " kilograms");
				 		
				 	} else if (unit.equalsIgnoreCase("kg")) {
				 		double amount8 = Double.parseDouble(amount);
				 		amount8 *= 2.20462;
				 		System.out.println((amount + " " + unit) + " = " + amount8 + " pounds");
				 		
				 	}
				 	}
				 	
				 	
				 	
				 	
				 		
				 	}
			 }

		}
		
		
		
		
		
		
	

