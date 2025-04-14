package day3;

public class CountWordInSentence {

	public static void main(String[] args) {
		
		String sentence = "Hello World, Welcome to Java Programming!!!";
		
		String[] word = sentence.split("\\s");
		
		System.out.println("Count Word in sentence is "+word.length);
	}
}
