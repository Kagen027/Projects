package lab2;

import java.util.Scanner;

/*6. Write a method to prompt the user for a double then display the value as a whole number. eg user enter 
"15 .8" result is: "You entered 15.8, the new value is 16". eg user enter "15 .4" result is: "You entered 15.4, the new value is 15".*/

public class DoubleToInt {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.print("Please enter a number with a 10th decimal value ");
    double withDecimal = scanner.nextDouble();
    scanner.close();

    System.out.println("Your number rounded to the nearest whole number = "+Math.round (withDecimal));

    }
}

