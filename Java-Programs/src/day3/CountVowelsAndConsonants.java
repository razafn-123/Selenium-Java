package day3;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		System.out.println("W.A.P to count the vowels & consonants from the sentence and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input = scan.nextLine();
		System.out.println(input);
		int[] count = countVowelsConsonants(input);
		System.out.println("No of Vowels is "+count[0]);
		System.out.println("No of Consonants is "+count[1]);
		scan.close();
	}
	
	public static int[] countVowelsConsonants(String str) {
		
		int cVowels = 0;
		
		int cConsonants = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if( (ch == 'a') || (ch == 'e' ) || (ch == 'i' ) || (ch == 'o' ) || (ch == 'u') || (ch == 'A') || (ch == 'E' ) || (ch == 'I' ) || (ch == 'O' ) || (ch == 'U') ) {
				
				cVowels++;
			}
			else if( ((ch >= 'a') && (ch <='z')) || ( (ch >='A') && (ch <= 'Z') ) ) {
				
				cConsonants++;
			}
		}
		
		return new int[] {cVowels, cConsonants};
	}

}
