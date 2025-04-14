package day3;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		
		String input = "000012345";
		
		input = input.replaceFirst("^0+(?!$)", "");
		
		System.out.println("String without leading zeroes is "+" '"+input+"'");
	}
}
