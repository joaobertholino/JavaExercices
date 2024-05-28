package season4.exerciseOne.entities;

import java.lang.Math;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle(){
		this.width = 0.0;
		this.height = 0.0;
	}

	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double area(){
		return this.width * this.height;
	}

	public double perimeter(){
		return this.width * 2 + this.height * 2;
	}

	public double diagonal(){
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}

	@Override
	public String toString(){
		return "Width: " + String.format("%.2f%n", this.width) + "Height: " + String.format("%.2f%n", this.height);
	}
}
