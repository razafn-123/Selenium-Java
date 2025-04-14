package day1;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
		
		System.out.println("W.A.P to Display Table of any number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which you want their table!");
		int input = scan.nextInt();
		System.out.println(input);
		for(int i = 1 ;i <= 10; i++) {
		
			System.out.println(input+" X "+i+" = "+(input*i));
			
		}
		
		scan.close();
	}

}