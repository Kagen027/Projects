package lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

//2. Write a method to prompt the user for base-width and height of a triangle, then calculate the area of the Triangle.

public class Triangle {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter Base-width ");
		double b = scanner.nextDouble();
        System.out.print("Please Enter Height ");
		double h = scanner.nextDouble();
		scanner.close();
		
		//Creating equation for area
        double area = ((b*h)/2);

		
		//import decimal formater to round number
		DecimalFormat df = new DecimalFormat(".###");
		
		//Printing out solution to console
		System.out.println("Area of the triangle = " + df.format(area));

	}
}

