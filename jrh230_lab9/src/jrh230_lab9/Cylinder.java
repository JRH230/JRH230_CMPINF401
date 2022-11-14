package jrh230_lab9;

public class Cylinder extends Circle {
	
	public double height;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius, double height) {
		
		super.setRadius(radius);
		this.height = 1.0;
		
	}
	
	public Cylinder(double radius, double height, String color) {
		
		super.setRadius(radius);
		this.height = 1.0;
		this.color = "Green";
		
	}
	
	public double getVolume() {
		
		double volume = height * Math.pow(radius, radius) * Math.PI; 
		return volume;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
