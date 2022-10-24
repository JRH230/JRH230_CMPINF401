package jrh230_lab7;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Driver {
	
	public static double max(double[] data) {
		double max = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
	return max;	
		
	}
	
	public static double min(double[] data) {
		double min = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		return min;
		
	}
	
	public static double sum(double[] data) {
		double sum = 0;
		for(int i = 0; i<data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public static double ave(double[] data) {
		double sum = 0;
		for(int i = 0; i<data.length; i++) {
			sum += data[i];
		}
		double average = sum / data.length;
		return average;
		
		
	}
	 
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter the desired array size: ");
		int size = Integer.parseInt(input);
		
		double[] data = new double[size*2];
		Random rNumber = new Random();
		
		for(int i = 0; i < size*2; i++) {
			data[i] = rNumber.nextInt(100);
		}
		System.out.println(Arrays.toString(data));
		System.out.println(max(data));
		System.out.println(min(data));
		System.out.println(sum(data));
		System.out.println(ave(data));
		

	}

}
