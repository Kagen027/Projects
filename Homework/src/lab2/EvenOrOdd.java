package lab2;

import java.util.Scanner;

//3. Write a method to prompt the user for a number then display check if the number is Even or Odd.

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter an Integer " );
		int number = in.nextInt();
		in.close();
		
		int remainder;
		remainder = number % 2;
		
		if( remainder == 0)
			System.out.println(number+" Is an Even Number");
		else
			System.out.println(number+" Is an Odd Number");
	}
}
