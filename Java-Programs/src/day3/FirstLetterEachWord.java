package day3;

public class FirstLetterEachWord {

	public static void main(String[] args) {
		
		String sentence = "Hello World, Welcome to Java Programming!!!";
		
		StringBuilder builder = new StringBuilder();
		
		for(String word : sentence.split("\\s")) {
		
			builder.append(word.charAt(0));
		}
		
		System.out.println(builder.toString());
	}
}