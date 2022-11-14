package jrh230_lab9;

public class Circle {

	public double radius;
	public String color;


	public Circle() {

	}

	public Circle(double radius) {

		this.radius = 5.0;

	}

	public Circle(double radius, String color) {

		this.radius = 5.0;
		this.color = "Green";

	}
	
	public double getArea() {
		double area = Math.pow(radius, radius) * Math.PI; 
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
