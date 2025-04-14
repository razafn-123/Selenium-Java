package day2;

import java.util.Scanner;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {

		System.out.println("W.A.P to print left numeric triangle which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = scan.nextInt();
		System.out.println(input);
		for(int i = input; i > 0; i--) {
			
			for(int j = i ; j > 0 ; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
