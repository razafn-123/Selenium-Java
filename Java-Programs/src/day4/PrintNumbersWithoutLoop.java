package day4;

import java.util.Scanner;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number would like to print");
		int number = scan.nextInt();
		printNumbers(number);
		scan.close();
		
	}

	public static void printNumbers(int n) {
		
		if(n==0)
			return;
		
		printNumbers(n-1);
		
		System.out.println(n);
		
	}
}
