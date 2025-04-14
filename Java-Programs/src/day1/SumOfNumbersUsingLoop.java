package day1;

import java.util.Scanner;

public class SumOfNumbersUsingLoop {

	public static void main(String[] args) {

		System.out.println("W.A.P to perform sum of numbers using loops which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which you want the sum of numbers.");
		int input = scan.nextInt();
		System.out.println(input);
		int sum = 0;
		while(input > 0) {
			
			System.out.println("Enter the number");
			int number = scan.nextInt();
			
			sum +=number;
			
			input--;
			
		}	
		System.out.println(sum);
		scan.close();
	}
}