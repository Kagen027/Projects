package lab2;

import java.util.Scanner;

/* 4. Write a method to prompt the user for an Integer then display the same value with one decimal 
place. eg user enter "15 " result is: "You entered 15, the new value is 15.0". */

public class AddDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Please Enter an Integer ");
		int beforeDecimal = scanner.nextInt();
		scanner.close();
		
		double afterDecimal = beforeDecimal*1.0;
		
		System.out.println("Your integer converted to add one decimal place = " +afterDecimal);
				
	}
}
