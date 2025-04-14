package day3;

import java.util.Scanner;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		
		System.out.println("W.A.P to remove duplicate character from sentence and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input = scan.nextLine();
		System.out.println(input);
		
		String removeDuplicate = removeDuplicate(input);
		
		System.out.print(removeDuplicate);

		scan.close();	
	}
	
	public static String removeDuplicate(String str) {
		
		String remove = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(remove.indexOf(ch) == -1) {
				
				remove +=ch;
			}
		}
		
		return remove;
	}
}