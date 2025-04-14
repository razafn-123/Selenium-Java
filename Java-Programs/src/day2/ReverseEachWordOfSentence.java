package day2;

import java.util.Scanner;

public class ReverseEachWordOfSentence {

	public static void main(String[] args) {

		System.out.println("W.A.P to reverse each word of sentence and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input1 = scan.nextLine();
		System.out.println(input1);
		String[] word = input1.split(" ");
		String reverseWord = "";
		for(String w : word) {
			
			StringBuilder sb = new StringBuilder(w);
			
			sb.reverse();
			
			reverseWord = reverseWord + sb.toString()+" ";
		}
		
		System.out.println(reverseWord.trim());
		
		scan.close();
		
	}
}