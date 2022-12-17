package lab1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Please Enter Integer ");
    int no = scanner.nextInt();
    scanner.close();
    isPrime(no);
       
        
    }

    public static void isPrime(int no){
    
    int count = 0;

    if(no>1){
        for(int i=1;i<=no;i++){
        if(isFactor(no,i))
        count++;
        }
        
        if(count==2){
            System.out.println("This is a prime number!");
        }
        
        else{
            System.out.println("This is not a prime number");
        }
    }

    else{
        System.out.println("Not a prime number");
    }
    }

    public static boolean isFactor(int n, int k) {
		if (n % k == 0)
			return true;
		else
			return false;
	
	}
}




//number > 1
//if it has more than 3 factors it is not a prime number

