package lab5;

import java.util.Scanner;

public class LabFive {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    System.out.print("Pleasse enter phrase: ");
    String phrase = in.nextLine();
    
//Scanner setup for charCounter.  Uncomment and run with scanner above    
    //System.out.print("Please enter a letter to count: ");
    //char ch = in.next().charAt(0);
    in.close();
    
    //charCounter(phrase,ch);
    //noWhitespace(phrase);
    //findDups(phrase);
    reverse(phrase);
    }

    public static void charCounter(String phrase, char ch){
        //converting everything to lowercase to insure every instance of that letter is counted no matter how users inputs it
        phrase = phrase.toLowerCase();
        ch =Character.toLowerCase(ch);

        char[] chArray = new char[phrase.length()];
        int counter = 0;
        
        for(int i = 0; i < phrase.length(); i++){
            chArray[i]=phrase.charAt(i);
        }
        //System.out.println(chArray.length);
        //System.out.println(chArray);
        for(int i = 0; i < chArray.length; i++){
            if(chArray[i]==ch){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void noWhitespace(String phrase){
        char[] chArray = new char[phrase.length()];
        
        for(int i = 0; i < phrase.length(); i++){
            chArray[i]=phrase.charAt(i);
        }
        //System.out.println(chArray);

        for(int i = 0; i < chArray.length; i++){
            if(chArray[i]==' '){
                chArray[i]='\0';
            }
        }
        System.out.println(chArray);
    }    

    public static void findDups(String phrase){
        
        StringBuilder dup = new StringBuilder();
        
        //taking user input and making char Array propper size and then giving Array value of each character
        char[] chArray = new char[phrase.length()]; 
        for(int i = 0; i < phrase.length(); i++){
            chArray[i]=phrase.charAt(i);
        }

        //Logic for finding duplicates
        for(int i = 0; i < chArray.length; i++){
            boolean multiple = false;
            for(int j = i+1; j<chArray.length; j++){
                if(chArray[i]==chArray[j]){
                multiple=true;
                break;
                }
            
            }if(multiple){
                dup.append(chArray[i]);
            }
            
        }
        System.out.println("Duplicates character from your entry: " +dup);
    }

    public static void reverse(String phrase){
        String reverse = "";
        char ch;
        
        for(int i=0; i<phrase.length(); i++){
            ch=phrase.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }
    

}

