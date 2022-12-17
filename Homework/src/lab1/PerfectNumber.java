package lab1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integer ");
        int no = scanner.nextInt();
        scanner.close();
        isPerfect(no);
    }

    public static void isPerfect(int no){
       int totalFactor = 0; 
       for(int i=1;i<no ; i++) {

            if(isFactor(no, i)) {

                totalFactor +=i;
            }
       }
       if (totalFactor == no)
       System.out.println("Its a perfect number");
       else
       System.out.println("Not a perfect number");
    }

    public static boolean isFactor(int n, int k) {
		if (n % k == 0)
			return true;
		else
			return false;
	
	}

    
}
