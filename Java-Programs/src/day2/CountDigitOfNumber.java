package day2;

import java.util.Scanner;

public class CountDigitOfNumber {

	public static void main(String[] args) {

		System.out.println("W.A.P to count the number of digit in a number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number which you want to count their digits!!!");
		int input = scan.nextInt();
		System.out.println(input);
		int count = 0;
		int number = input;
		while(input > 0) {
			
			input = input/10;
			
			count++;
		}
		
		System.out.println(count+" Digit in a "+number);
		scan.close();
	}
}