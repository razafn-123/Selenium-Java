package day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("W.A.P to display the prime number which is given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = scan.nextInt();
		System.out.println(input);
		boolean flag = false;
		for(int i = 2 ; i < input/2; i++ ) {
			
			if(input % i == 0) {
	
				flag = true;
				
				break;
			}
			
		}
		
		if(flag == true) {
			
			System.out.print(input+ " is not a prime number");
		}
		else {
			
			System.out.print(input+ " is a prime number");

		}
		scan.close();
		
	}

}
