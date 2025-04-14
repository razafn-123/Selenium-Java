package day1;

import java.util.Scanner;

public class GetFirstDigitOfNumber {

	public static void main(String[] args) {
		
		System.out.println("W.A.P to get the first digit of number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which you want their first digit!");
		int input = scan.nextInt();
		System.out.println(input);
		int digit = 0;
		while(input > 0) {
			
			digit = input % 10;
			
			input = input / 10;
		
		}
		
		System.out.println("First Digit is "+digit);
		
		scan.close();
		
	}

}