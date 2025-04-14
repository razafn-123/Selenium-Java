package day2;

import java.util.Scanner;

public class RemoveSpaceFromSentence {

	public static void main(String[] args) {
		
		System.out.println("W.A.P to remove space from sentence and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input = scan.nextLine();
		System.out.println(input);
		input = input.replaceAll(" ", "");
		System.out.print(input);
		scan.close();
	}
}