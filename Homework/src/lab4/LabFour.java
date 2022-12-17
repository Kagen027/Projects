package lab4;

import java.util.Scanner;

public class LabFour {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Please insert number: ");
        // int a = scanner.nextInt();
        // System.out.print("Please insert another: ");
        // int b = scanner.nextInt();
        // sameDigit(a,b);

        System.out.print("Is it summer?: ");
        boolean isSummer = scanner.nextBoolean();
        System.out.print("What is the temp?: ");
        int temp = scanner.nextInt();
        squirrelPlay(temp,isSummer);

        // System.out.print("Enter number: ");
        // int a =scanner.nextInt();
        // System.out.print("Another one: ");
        // int b =scanner.nextInt();
        // System.out.print("Another one: ");
        // int c =scanner.nextInt();
        // System.out.println(greenTicket(a,b,c));

        // System.out.print("Enter character: ");
        // String phrase = scanner.next();
        // findingxx(phrase);
        
        // System.out.print("Please enter phrase: ");
        // String phrase = scanner.nextLine();
        // System.out.print("How manytime do you want it repeated?: ");
        // int dup = scanner.nextInt();
        // stringRepeat(phrase, dup);

        scanner.close();
       
    }
     
    public static void sameDigit (int a, int b){   
        int sum = a + b;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();
        
        //System.out.println(aLength);
        //System.out.println(sumLength);

        if(aLength==sumLength){
            System.out.println(sum);
        }else{
            System.out.println(a);
        }
        
        
        } 

        
    public static void squirrelPlay(int temp, boolean isSummer){
      
        if(isSummer && temp <= 100 && temp >= 60){
            System.out.println("The squirrels come out to play!");
        }else if(!(isSummer) && temp <=90 && temp >= 60){
            System.out.println("The squirrels come out to play!");
        }else{
            System.out.println("No squirrels out to play :(");
        }
    
        }
    
    public static int greenTicket(int a, int b, int c){
    if (a==b && a==c)
        return 20;    
    if (a==b || a==c || b==c)
        return 10;
    else;
        return 0;
    }
    
    public static void findingxx(String phrase){
        char[] charArray = phrase.toCharArray();
        System.out.println(charArray);
        int count = 0;

        for(int i=0; i<charArray.length; i++){
         for(int j=i+1; j<charArray.length;){
            if(charArray[i]=='x' && charArray[j]=='x')
               count++;
               break;
         }   
        }
        System.out.println(count);
    }

    public static void stringRepeat(String phrase, int dup){
        String temp = "";
        
        for(int i=0; i<dup; i++) {
          temp = temp + phrase;
        }
        System.out.println(temp);
    }

}


//phrase and int
//
