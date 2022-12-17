package lab2;

import java.util.Scanner;

/* 7. Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.

How to determine whether a year is a leap year
To determine whether a year is a leap year, follow these steps:

1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3 .If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days).
5. The year is not a leap year (it has 365 days). */

public class LeapYear {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Please enter a 4 digit year ");
    int year = scanner.nextInt();
    scanner.close();

    if(year%4==0){
        if(year%100==0){
            if(year%400==0){
                System.out.println("This is a leap year");
            } else {
                System.out.println("This is not a leap year");
            }
        }else{
            System.out.println("This is a leap year");
        }
    }else{
        System.out.println("This is not a leap year");    
    }
    }
    
}
