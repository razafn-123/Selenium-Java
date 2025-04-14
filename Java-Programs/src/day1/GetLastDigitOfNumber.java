package day1;

import java.util.Scanner;

public class GetLastDigitOfNumber {

	public static void main(String[] args) {

		System.out.println("W.A.P to get the last digit of number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which you want their last digit!");
		int input = scan.nextInt();
		System.out.println(input);
		int digit = input % 10;
		System.out.println("Last Digit is "+digit);
		scan.close();
	}
}