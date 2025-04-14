package day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailValidation {

	public static void main(String[] args) {

		
		System.out.println("W.A.P to check whether given string is valid email pattern or not and that will be given by user at runtime!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the email pattern:");
		String email = scan.nextLine();
		System.out.println(email);
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
					   		"[a-zA-Z0-9_+&*-]+)*@"+
					   		"(?:[a-zA-Z0-9-]+\\.)+[a-z"+
					   		"A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(emailRegex);
		
		Matcher mat = pat.matcher(email);
		
		if(mat.matches()) {
			
			System.out.println("Valid Email");
		}
		else {
			
			System.out.println("Invalid Email");
		}	
		scan.close();
	}
}