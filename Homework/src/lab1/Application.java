package lab1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	        
    //scanner to check solution for max3, min3, and middle3.  Last line of scanner max3 just needs changed to min3 or middle3 to run those methods instead.

	    /* System.out.print("Please enter First integer ");
	    int num1 = scanner.nextInt();
	    System.out.print("Please enter Second integer ");
	    int num2 = scanner.nextInt();
	    System.out.print("Please enter Third integer ");
	    int num3 = scanner.nextInt();
	    scanner.close();
	    max3(num1, num2, num3); */

    //scanner to check code for xor method

        /* System.out.println("Try your luck and enter two numbers 1-5. your goal is to get one and only of the selected numbers.");
        System.out.println("if you choose booth you fail, if you select no correct numbers you fail! True = Pass and False = Fail!");
        System.out.print("Please enter first integer ");
        int n = scanner.nextInt();
        System.out.print("Please enter a second integer ");
        int k = scanner.nextInt();
        scanner.close();
        boolean result = xor(n, k);
        System.out.println(result); */
    
    // scanner to check code for isFactor method

        /* System.out.print("Please enter first integer ");
        int n = scanner.nextInt();
        System.out.print("Please enter a second integer that is a factor of the first ");
        int k = scanner.nextInt();
        scanner.close();
        boolean result = isFactor(n, k);
        System.out.println(result);  */
    
    //scanner to check code for isPerfect method

        /* System.out.print("Enter Integer ");
        int no = scanner.nextInt();
        scanner.close();
        isPerfect(no); */

    //scanner to check code operation for isPrime method
       
         System.out.print("Please Enter Integer ");
        int no = scanner.nextInt();
        scanner.close();
        isPrime(no); 

	}
	        
	// 1. Write a method called "max3" that finds the largest of THREE integers.
	public static void max3(int num1, int num2, int num3) {
		
		 if ((num1 > num2) && (num1 > num3)){
	            System.out.println(num1 + " Is the greatest");
	        }
	        else if((num2 > num1) && (num2 > num3)){
	            System.out.println(num2 + " Is the greatest");
	        }
	        else{
	            System.out.println(num3 + " Is the greatest");
	        }
	        
	}

    // 2. Write a method called "min3" that finds the smallest of THREE Integers. 
    public static void min3(int num1, int num2, int num3) {
		
		

        if ((num1 < num2) && (num1 < num3)){
               System.out.println(num1 + " Is the smallest");
           }
           else if((num2 < num1) && (num2 < num3)){
               System.out.println(num2 + " Is the smallest");
           }
           else{
               System.out.println(num3 + " Is the smallest");
           }
       
   }

   /* 3. Write a method called "middle3" that computes the MIDDLE value of THREE integers. Hint: for the case of three numbers, the middle is the value that 
   is NOT the maximum NOR the minimum, so add the three values and subtract out the min and max, using the methods you wrote for problems #1 and #2. */

   //Wasn't picking up what the hint was trying to get at... seemed like more work and more confusing then just solving my own way.
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

    /*4. Write a method called "xor" that takes two boolean values (either true or false) and returns a boolean value which is true if EITHER of the values is true 
    BUT NOT BOTH of them. This is called the "xor" function, or "eXclusive OR" (where we are excluding the case where both values are true).*/

    
    public static boolean xor(int n, int k) {
        if((n==1)^(k==3) || (n==3)^(k==1)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    //5. Write a method "isFactor" which takes two integers (k and n) and returns true if ("if and only if") k is a factor of n.
    
    public static boolean isFactor(int n, int k) {
		if (n % k == 0){
			return true;
        }    
		else{
			return false;
        }
	}

    /* 6. Write a method "isPerfect" which takes an integer and returns true if that integer is a perfect number Your method 
    MUST call the "isFactor" method you wrote for problem #5.*/
    
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


     /* 7. Write a method "isPrime" which takes an integer and returns true if it is a prime number. Your method MUST call the "isFactor" 
     method you wrote for problem #5. */

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
}
    
