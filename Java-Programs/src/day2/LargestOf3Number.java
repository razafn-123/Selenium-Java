package day2;

import java.util.Scanner;

public class LargestOf3Number {

	public static void main(String[] args) {

		System.out.println("W.A.P to find the largest of 3 Number(number must not repeat) and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int input1 = scan.nextInt();
		System.out.println(input1);
		System.out.println("Enter the second number:");
		int input2 = scan.nextInt();
		System.out.println(input2);
		System.out.println("Enter the third number:");
		int input3 = scan.nextInt();
		System.out.println(input3);
		if(input1 >=input2  && input1 >= input3) {
			
			System.out.println(input1+" is the largest number!!!");
		}
		else if(input2 >=input1  && input2 >= input3) {
			
			System.out.println(input2+" is the largest number!!!");
			
		}
		else {

			System.out.println(input3+" is the largest number!!!");
			
		}
		
		scan.close();
	}

}
