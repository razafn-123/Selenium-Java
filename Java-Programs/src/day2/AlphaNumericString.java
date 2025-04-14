package day2;

import java.util.Scanner;

public class AlphaNumericString {

	public static void main(String[] args) {

		System.out.println("W.A.P to seperate number, special character from String and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the AlphaNumeric String:");
		String alphaNumeric = scan.nextLine();
		System.out.println(alphaNumeric);
		StringBuilder alphabet = new StringBuilder();
		StringBuilder numeric  = new StringBuilder();
		StringBuilder special  = new StringBuilder();
		
		for(int i = 0; i < alphaNumeric.length(); i ++) {
			
			if(Character.isDigit(alphaNumeric.charAt(i))) {
				
				numeric.append(alphaNumeric.charAt(i));
			}
			else if(Character.isAlphabetic(alphaNumeric.charAt(i))) {
				
				alphabet.append(alphaNumeric.charAt(i));
			}
			else {
				
				special.append(alphaNumeric.charAt(i));	
			}
			
		}
		
		System.out.println("Alphabet is "+alphabet);
		System.out.println("Number is "+numeric);
		System.out.println("Special Character is "+special);
		
		scan.close();
	}
}