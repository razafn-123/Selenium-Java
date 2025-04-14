package day1;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOfString {

	public static void main(String[] args) {

		System.out.println("W.A.P to check whether String is anagrams or not and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String input1 = scan.next();
		System.out.println(input1);
		System.out.println("Enter the second String:");
		String input2 = scan.next();
		System.out.println(input2);
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		//Check if the length is same
		if(input1.length() == input2.length()) {
			
			char[] value1 = input1.toCharArray();
			
			char[] value2 = input2.toCharArray();
			
			Arrays.sort(value1);
			
			Arrays.sort(value2);
			
			boolean result = Arrays.equals(value1, value2);
			
			if(result) {
				
				System.out.print(input1+ " & "+input2+" is an Anagram");
			}
			else {
				
				System.out.print(input1+ " & "+input2+" is not an Anagram");	
			}		
		}
		else {
			
			System.out.print(input1+ " & "+input2+" is not an Anagram");
		}
		scan.close();
	}
}