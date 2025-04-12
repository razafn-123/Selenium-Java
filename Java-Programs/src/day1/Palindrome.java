package day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("W.A.P to reverse the String which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String which you want to reverse!");
		String input = scan.next();
		System.out.println(input);
		int size = input.length();
		String reverse = "";
		while(size > 0) {
			
			char ch = input.charAt(size - 1);
			reverse = reverse + ch;
			size--;
		}
		
		System.out.println("Reverse String is "+reverse);
		
		if(input.equals(reverse)) {
			
			System.out.println("Palindrome is "+reverse);
		}
		else {
			
			System.out.println("Not a palindrome is "+reverse);
		}
		
		scan.close();

	}

}