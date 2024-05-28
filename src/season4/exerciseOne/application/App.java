package season4.exerciseOne.application;

import season4.exerciseOne.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the width measurement of the rectangle: ");
		double width = in.nextDouble();

		System.out.print("Enter the height measurement of the rectangle: ");
		double height = in.nextDouble();

		Rectangle myRectangle = new Rectangle(width, height);
		System.out.println(myRectangle);
		System.out.printf("Area: %.2f%n", myRectangle.area());
		System.out.printf("Perimeter: %.2f%n", myRectangle.perimeter());
		System.out.printf("Diagonal: %.2f%n", myRectangle.diagonal());
	}
}
