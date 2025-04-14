package day2;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		System.out.println("W.A.P to get factorial number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = scan.nextInt();
		System.out.println(input);
		int number = input;
		int fact = 1 ;
		while(input > 0) {
			
			int remainder = input % 10;
			
			fact = fact * remainder;
			
			input--;
		}
		
		System.out.println(fact+" is a factorial of "+number);
		
		scan.close();
		
	}

}