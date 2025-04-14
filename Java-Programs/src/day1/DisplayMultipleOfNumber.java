package day1;

import java.util.Scanner;

public class DisplayMultipleOfNumber {

	public static void main(String[] args) {

		System.out.println("W.A.P to display the mulitple of number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number!");
		int input = scan.nextInt();
		System.out.println(input);
		System.out.println("Enter the nth Number for Up to what extent is multiple needed?");
		int value = scan.nextInt();
		int multiple = input;
		while( input <= value ) {
		
			System.out.println(input+" is multiple of "+multiple);
			
			input += multiple;
	
		}
		
		
		
		
		scan.close();
		
	}

}
