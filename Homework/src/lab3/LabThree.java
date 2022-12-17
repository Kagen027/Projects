package lab3;

import java.util.Scanner;

public class LabThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Scanner for chRemover
		
		// System.out.print("Please insert word: ");
		// String word = scanner.next();
		// System.out.print("Select one character you would like removed from "+word+": ");
		// char remove = scanner.next().charAt(0);
		// //System.out.println(remove);
		// scanner.close();
		// chRemover(word, remove);
		
		//Scanner for duplicateRemover, vowelsConsonants, and firstNonRepeat.  uncomment whichever function you want to use
		System.out.print("Please insert Phrase:");
		String phrase = scanner.nextLine();
		System.out.println("You Entered: "+phrase);
		scanner.close();


		// firstNonRepeat(phrase);
		// duplicateRemover(phrase);
		// vowelsConsonants(phrase);
		

	}

	public static void chRemover(String word, char remove) {
		//Character.toLowerCase is required to make
		int i=0;
		while(i < word.length()) {
			char ch = word.charAt(i);
			if(Character.toLowerCase(ch)==Character.toLowerCase(remove)) {
				String before = word.substring(0,i);
				String after = word.substring(i + 1);
				word = before + after;
			}else {
				i++;
			}
		}
		System.out.println(word);
	}


	public static void duplicateRemover(String phrase) {
		char[] withDuplicates = phrase.toCharArray();
		//System.out.println(withDuplicates);
		StringBuilder withoutDuplicates = new StringBuilder();
		
		for(int i=0; i<withDuplicates.length; i++) {
			boolean repeated = false;
			for(int j=i+1; j<withDuplicates.length; j++) {
				if(Character.toLowerCase(withDuplicates[i]) == Character.toLowerCase(withDuplicates[j])) {
					repeated = true;
					break;
				}
			}
			if (!repeated)
				withoutDuplicates.append(withDuplicates[i]);
		}
		System.out.println(withoutDuplicates+": is your input wihtout duplicate characters");
	}
	
	
	public static void vowelsConsonants(String phrase) {
		int vowels = 0, consonants = 0;
		phrase = phrase.toLowerCase();
		
		for (int i=0; i<phrase.length(); i++) {
			char ch = phrase.charAt(i);
			
			//check for vowels = a , e , i , o , u
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				++vowels;
			}else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants: "+consonants);
	}
	
	
	public static void firstNonRepeat(String phrase) {
		//morning
		// n needs removed and printed at the end
		
		phrase = phrase.toLowerCase();
		char[] original = phrase.toCharArray();
		StringBuilder nonRepeat = new StringBuilder();
		StringBuilder repeated = new StringBuilder();
		
		
		
		for(int i=0; i<original.length; i++) {
			boolean dup = false;
			for(int j=i+1; j<original.length; j++) {
				if(original[i]==original[j]) {
					dup = true;
					original[j]=' ';
					break;
					}
				}if(dup) {
				repeated.append(original[i]);
				repeated.append(original[i]);
				}else {
				nonRepeat.append(original[i]);	
				}
			
			}
		System.out.print(nonRepeat);
		System.out.print(repeated);
	}
}
	


	



