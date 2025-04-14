package day2;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {

		System.out.println("W.A.P to print right star triangle which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = scan.nextInt();
		System.out.println(input);
		for(int i = 0; i < input; i++) {
			
			for(int j = i ; j >= 0 ; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
		
		
	}

}
