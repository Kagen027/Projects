package lab2;

import java.util.Scanner;

//5. Write a method to prompt the user for a letter of the alphabet and display it's ascii value.

public class Ascii {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any letter your heart desires ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        
        System.out.println((int)ch + " Is your Ascii value");
    }
}
