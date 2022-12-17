package lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

//1. Write a method to prompt the user to enter the radius of the circle then calculate the area and circumference of the circle.

public class Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter Radius of Circle ");
		double radius = scanner.nextDouble();
		scanner.close();
		
		//Calling back methods and giving a value to solution
		double circumferencProduct = circumferenceCalculator(radius);
		double areaProduct = areaCalculator(radius);
		
		//had to use decimal formatter couldn't get Math.round *100/100 to work... kept giving int solution
		DecimalFormat df = new DecimalFormat(".###");
		
		//Printing out solution to console
		System.out.println("Circumference of Circle = " + df.format(circumferencProduct));
		System.out.println("Area of Circle = " + df.format(areaProduct));

	}

	public static double circumferenceCalculator(double radius) {
		double circumference = radius*(Math.PI * 2);
		return circumference;
	}
	
	public static double areaCalculator(double radius) {
		double area = (radius * radius) * Math.PI;
		return area;
	}
	
}

