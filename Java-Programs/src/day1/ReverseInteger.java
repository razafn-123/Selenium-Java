package day1;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {

		System.out.println("W.A.P to reverse the Integer which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer which you want to reverse!");
		int input = scan.nextInt();
		System.out.println(input);
		int value = 0;
		while(input > 0) {
			
			int remainder  = input % 10;
			
			value = value*10 + remainder;
			
			input = input / 10;
		}
		
		System.out.println("Reverse Integer is "+value);
		
		scan.close();
	}

}