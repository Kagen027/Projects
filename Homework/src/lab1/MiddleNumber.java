package lab1;

import java.util.Scanner;

public class MiddleNumber {
public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter First integer ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter Second integer ");
        int num2 = scanner.nextInt();
        System.out.print("Please enter Third integer ");
        int num3 = scanner.nextInt();
        scanner.close();
        middle3(num1, num2, num3);
}
	
	public static void middle3(int num1, int num2, int num3) {
		
		 if (((num1 > num2) && (num1 < num3)) || ((num1 < num2) && (num1 > num3))){
	            System.out.println(num1 + " Is the middle number");
	        }
	        else if(((num2 > num1) && (num2 < num3)) || ((num2 < num1) && (num2 > num3))){
	            System.out.println(num2 + " Is the middle number");
	        }
	        else{
	            System.out.println(num3 + " Is the middle number");
	        }
	
	}
}


