package lab1;

import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter first integer ");
        int n = scanner.nextInt();
        System.out.print("Please enter a second integer that is a factor of the first ");
        int k = scanner.nextInt();
        scanner.close();
        boolean result = isFactor(n, k);
        System.out.println(result);
       
}
	
	public static boolean isFactor(int n, int k) {
		if (n % k == 0)
			return true;
		else
			return false;
	
	}
}

